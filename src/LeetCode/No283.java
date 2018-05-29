package LeetCode;

public class No283 {
    public void moveZeroes(int[] nums) {
        int pos1 = 0 ;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pos1]=nums[i];
                pos1++;
            }
        }
        for(int i= pos1 ;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
