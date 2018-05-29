package LeetCode;

public class No108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums,0,nums.length-1);
    }
    private TreeNode sort (int[] nums ,int start ,int end){
        if(nums==null)return null;
        if(start>end)return null;
        if(start==end)return new TreeNode(nums[start]);
        int len = end - start +1 ;
        int root = 0 ;
        if((len&1)==1){
            root = start+len/2;
        }else{
            root = start+len/2;
        }
        TreeNode rootNode = new TreeNode(nums[root]);
        rootNode.left = sort(nums,start,root-1);
        rootNode.right = sort(nums,root+1,end);
        return rootNode;
    }
}
