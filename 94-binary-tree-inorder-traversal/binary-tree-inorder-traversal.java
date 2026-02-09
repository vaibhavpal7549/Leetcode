/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static void postOrder(TreeNode root, List<Integer> al){
        if(root == null){
            return;
        }
        postOrder(root.left, al);
        al.add(root.val);
        postOrder(root.right, al);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null){
            return al;
        }
        postOrder(root, al);
        return al;
    }
}