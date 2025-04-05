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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        boolean isPalin = true;
        Stack<Integer> s = new Stack<>();
        while(slow!=null){
            s.push(slow.val);
            slow = slow.next;
        }
        while(head!=null){
            int i = s.pop();
            if(head.val!=i){
                isPalin = false;
            }
            head = head.next;
        }
        return isPalin;
    }
}