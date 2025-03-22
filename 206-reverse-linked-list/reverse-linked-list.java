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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(list);
        if(list.size() == 0) return null;
        ListNode res = new ListNode(list.get(0));
        ListNode ans = res;
        for(int i = 1; i<list.size(); i++){
            ans.next = new ListNode(list.get(i));
            ans = ans.next;
        }
        return res;
        
    }
}