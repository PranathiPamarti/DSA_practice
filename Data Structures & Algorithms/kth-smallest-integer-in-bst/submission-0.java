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


public class Solution{
    private int count=0;
    private int result=0;

    private void  inorder(TreeNode node,int k){
        if(node==null)return;
        inorder(node.left,k);
        if(count++==k-1){
            result= node.val;
        }

        inorder(node.right,k);
    }


    public int kthSmallest(TreeNode root,int k){
        inorder(root,k);
        return result;
    }
}



 

