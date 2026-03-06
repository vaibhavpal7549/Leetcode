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
    public static int helper(TreeNode root, int[] ans){
        if(root == null) return 0;
        int left = helper(root.left, ans);
        int right = helper(root.right, ans);

        ans[0] = Math.max(ans[0], Math.max(root.val, Math.max(root.val+left, Math.max(root.val+right, left+root.val+right))));
        return Math.max(root.val, Math.max(root.val + left, root.val+right));
    }
    public int maxPathSum(TreeNode root) {
        int [] ans = new int[1];
        ans[0] = Integer.MIN_VALUE;
        helper(root, ans);
        return ans[0];

    }
}