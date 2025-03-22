/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = headA;

        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        
        temp = headB;
        while (temp != null) {
            if (list.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }
}
