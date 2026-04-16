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
    int prev=Integer.MAX_VALUE;
    public boolean isValidBST(TreeNode root) {
        return helper(root);
    }
    public boolean helper(TreeNode root){
        if(root==null)return true;

        if(!helper(root.left))return false;

        if(prev!=Integer.MAX_VALUE && root.val<=prev){
            return false;
        }
        prev = root.val;
        return helper(root.right);
    }
}
