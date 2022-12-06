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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode Head = head.next;
        while(odd != null && odd.next != null && even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            if(odd.next != null)
            {
                even.next = odd.next;
                even = even.next;
            }
        }
        odd.next = Head;
        even.next = null;
        
        return head;
        }    
    }
