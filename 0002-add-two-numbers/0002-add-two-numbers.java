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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode ptr=result;
        int c=0;
        while(l1!=null || l2!=null){
            int s=0+c;
            if(l1!=null){
                s=s+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                s=s+l2.val;
                l2=l2.next;
            }
            c=s/10;
            s=s%10;
            ptr.next=new ListNode(s);
            ptr=ptr.next;
        }
         if(c==1)
        {
            ptr.next=new ListNode(1);
        }
    return result.next;
}
}