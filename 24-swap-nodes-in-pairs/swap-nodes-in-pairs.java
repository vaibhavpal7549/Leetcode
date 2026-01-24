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
        ArrayList<Integer> al = new ArrayList<>();
        ListNode ptr = head;

        while(ptr != null){
            int data = ptr.val;
            al.add(data);
            ptr = ptr.next;
        }
        for(int i = 0; i<al.size()-1; i += 2){
            int temp = al.get(i);
            al.set(i, al.get(i+1));
            al.set(i+1, temp);

        }

        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        for(int el : al){
            curr.next = new ListNode(el);
            curr = curr.next;
        }

        return ans.next;
        
    }
}