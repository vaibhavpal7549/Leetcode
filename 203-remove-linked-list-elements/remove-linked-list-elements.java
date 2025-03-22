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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        
        list.removeIf(x -> x == val);
        if(list.size() == 0) return null;

        ListNode newHead = new ListNode(list.get(0));
        ListNode curr = newHead;

        for (int i = 1; i < list.size(); i++) {
        curr.next = new ListNode(list.get(i));
        curr = curr.next;
        }

        return newHead;
        
    }
}