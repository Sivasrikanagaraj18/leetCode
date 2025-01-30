/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
         if(head==null||head.next==null) return;
        ListNode middle=middle(head);
        ListNode secondhalf=reversedList(middle.next);
        middle.next=null;
        combine(head,secondhalf);
    }
        private ListNode middle(ListNode head){
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

        private ListNode reversedList(ListNode head){
         ListNode prev=null;
         ListNode next=null;
         ListNode curr=head;
         while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         return prev;
        }

        private void combine(ListNode first,ListNode second){
            ListNode p1=first;
            ListNode p2=second;
        while(p2!=null){
            ListNode t1=p1.next;
            ListNode t2=p2.next;
            p1.next=p2;
            if(t1==null) break;
            p2.next=t1;
            p1=t1;
            p2=t2;
        }
        }
    }