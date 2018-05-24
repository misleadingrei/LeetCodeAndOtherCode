package LeetCode;
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MinimumDepthOfBinaryTree {
    public int run(TreeNode root) {
        if(root==null)return 0;
        return countDepth(root);

    }
    private int countDepth(TreeNode root)
    {
        if(root.left==null)
        {
            if(root.right==null)
                return 1;
            else
                return countDepth(root.right)+1;
        }
        else{
            if(root.right==null)
                return countDepth(root.left)+1;
            else
                return Math.min(countDepth(root.right),countDepth(root.left))+1;
        }
}
