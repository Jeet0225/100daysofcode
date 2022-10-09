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
    public ListNode swapPairs(ListNode head) {
        
            if(head==null) return head;

            ListNode pre = head;
            ListNode curr = head.next;

            while(pre.next!=null && curr.next!=null)
            {
                int temp = pre.val;
                 pre.val = curr.val;
                curr.val = temp;

                pre=curr.next;
                curr=pre.next;
            }

            if(pre!=null && curr!=null)
            {
                int temp = pre.val;
                 pre.val = curr.val;
                curr.val = temp;
            }

            return head;
    }
}