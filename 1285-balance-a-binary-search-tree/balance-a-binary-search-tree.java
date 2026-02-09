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
    ArrayList<TreeNode> al = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
        return sortedArrayToBST(0, al.size()-1);
        
    }
    void inOrder(TreeNode root){
        if(root ==null)return ;
        inOrder(root.left);
        al.add(root);
        inOrder(root.right);
    }

    TreeNode sortedArrayToBST(int start, int end){
        //Base Case
        if(start >end) return null;
        int mid = start + (end-start)/2;
        TreeNode root = al.get(mid);
        root.left = sortedArrayToBST(start, mid-1);
        root.right = sortedArrayToBST(mid+1, end);
        return root;

    }
}