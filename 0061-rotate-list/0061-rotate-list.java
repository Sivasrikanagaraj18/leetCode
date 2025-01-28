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
    public ListNode rotateRight(ListNode head, int k) {
    ListNode tail=head;
    int l=1;
    ListNode curr=head;
    if(head==null){
        return head;
    }
    while(tail.next!=null){
        tail=tail.next;
        l++;
    }
    k=k%l;
    if(k==0){
        return head;
    }
    for(int i=0;i<l-k-1;i++){
        curr=curr.next;
    }
    ListNode newh=curr.next;
    curr.next=null;
    tail.next=head;
    return newh;
    }
}