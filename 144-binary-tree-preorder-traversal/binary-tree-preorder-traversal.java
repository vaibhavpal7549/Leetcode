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
    public static void preOrder(TreeNode root, List<Integer> al ){
        if(root == null){
            return ;
        }
        al.add(root.val);
        preOrder(root.left, al);
        preOrder(root.right, al);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        if(root == null){
            return al;
        }
        preOrder(root, al);
        return al;
    }
}