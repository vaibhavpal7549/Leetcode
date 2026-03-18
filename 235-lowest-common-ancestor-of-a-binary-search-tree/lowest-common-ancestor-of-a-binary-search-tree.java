/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null) return null;
        if(root ==  p || root == q) return root;

        TreeNode leftAns = lowestCommonAncestor(root.left, p, q);
        TreeNode rightAns = lowestCommonAncestor(root.right, p,q);

        if(rightAns == null){
            return leftAns;
        }
        if(leftAns == null){
            return rightAns;
        }
        return root;
    }
}