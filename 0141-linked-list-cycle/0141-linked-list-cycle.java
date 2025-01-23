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
    public boolean hasCycle(ListNode head) {
        ListNode tortoise=head;
        ListNode hane=head;
        while(hane!=null && hane.next!=null){
            tortoise=tortoise.next;
            hane=hane.next.next;
            if(tortoise==hane){
                return true;
            }
        }
        return false;
    }
}