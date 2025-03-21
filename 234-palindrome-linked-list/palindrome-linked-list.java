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
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int l = 0;
        int r = list.size()-1;
        while(l<=r){
            if(list.get(l) != list.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
}