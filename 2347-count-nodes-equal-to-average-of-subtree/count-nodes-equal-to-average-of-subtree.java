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
    int result = 0;
    int sum = 0;
    int count = 0;

    public void findSum(TreeNode root) {
        if(root == null) return;

        sum += root.val;
        count++;

        findSum(root.left);
        findSum(root.right);
    }

    public void solve(TreeNode root) {
        if(root == null) return;

        sum = 0;
        count = 0;

        findSum(root);

        if(root.val == sum / count) {
            result++;
        }

        solve(root.left);
        solve(root.right);
    }

    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return result;
    }
}