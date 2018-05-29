package LeetCode;

public class No26 {
    public int removeDuplicates(int[] nums) {
        int pos1 = 0 ;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]!=nums[pos1]){
                nums[++pos1]=nums[i];
            }
        }
        return pos1+1 ;
    }
}
