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
    public ListNode sortList(ListNode head) {
        // ye list ko sort krne ke liye hai
        
        if(head == null || head.next == null)
            return head;
        
        
        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head;
        
        
        while(fast !=  null && fast.next != null){
            temp = slow;
            slow = slow.next;          
            fast = fast.next.next;  
            
        }   
        temp.next = null;            
        
        ListNode l1 = sortList(head);    
        ListNode l2 = sortList(slow); 
        
       return mergelist(l1, l2);         
    }
    // 2 list ko merge krne ka treeka hai 
    
    public ListNode mergelist(ListNode l1, ListNode l2) {
        
        if(l1 == null)return l2;
        if(l2 == null)return l1;
        
        if(l1.val > l2.val){
            ListNode temp = l1;
                        l1 = l2;
                        l2 = temp;
        }
        ListNode res = l1;
        while(l1 != null && l2 != null){
            
            ListNode t = null;
            
            while(l1 != null && l1.val <= l2.val){
                t = l1;
                l1 = l1.next;
            }
             t.next = l2;
            
          ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        return res;
    }
}