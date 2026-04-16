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
    HashMap<Integer,Integer> map;
    int preIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex = 0;
         map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder,0,inorder.length-1);
    }
    public TreeNode helper(int[] preorder,int start,int end){
        if(start>end)return null;

        int preIndexElement = preorder[preIndex++];
        TreeNode root = new TreeNode(preIndexElement);

        int index = map.get(preIndexElement);

        root.left = helper(preorder,start,index-1);
        root.right = helper(preorder,index+1,end);
        return root;
    }
}
