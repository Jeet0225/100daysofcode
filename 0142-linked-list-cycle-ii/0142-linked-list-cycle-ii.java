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
        
        if(head == null || head.next == null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode  ent = head;
        
        while(fast.next != null && fast.next.next != null){
             slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while(slow != ent){
                    slow = slow.next;
                    ent = ent.next;
                }
                return ent;
            }
         }
        return null;
    }
}