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
    public int pairSum(ListNode head) {
        ArrayList <Integer> res = new ArrayList<>();
        
        while(head != null){
            
            res.add(head.val);
            
            head = head.next;
        }
        
        int n = res.size();
        int sum = 0;
        
        for(int i = 0; i < n/2; i++)
            sum = Math.max(sum, res.get(i) + res.get(n - i - 1));
        return sum;
    }
}