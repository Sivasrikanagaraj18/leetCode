/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slowPtr=head,fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr){
                break;
                }
        }
        if(fastPtr==null||fastPtr.next==null) return null;
                while(head!=slowPtr){
                    head=head.next;
                    slowPtr=slowPtr.next;
                }
        return head;
    }
}