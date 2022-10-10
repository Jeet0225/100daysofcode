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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode beg = head;
        ListNode end = head;
        int length = size(head);
        for(int i=0; i<length - k; i++){
            end=end.next;
        }
        while(k>1){
            beg=beg.next;
            k--;
        }
        
        int temp = end.val;
        end.val = beg.val;
        beg.val = temp;
        
        return head;
    }
    private int size(ListNode head){
        
        int count =1;
        
        ListNode temp = head;
        while(temp.next!=null){
          temp = temp.next;
            count++;
        }
        return count;

    }
}