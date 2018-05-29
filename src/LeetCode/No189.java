package LeetCode;

public class No189 {
    public void rotate(int[] nums, int k) {
        if(nums==null||nums.length==0)return;
        //需要对K处理一下
        k=k%nums.length;
        swapNums(nums,0,nums.length-1);
        swapNums(nums,0,k-1);
        swapNums(nums,k,nums.length-1);
    }

    private void swapNums (int[] nums,int lo,int hi){
        while(lo<=hi){
            int temp = nums[lo];
            nums[lo]=nums[hi];
            nums[hi]=temp;
            lo++;
            hi--;
        }
    }
}
