package LeetCode;

public class No53 {
    public int maxSubArray(int[] nums) {
        int result = 0 ;
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ;i<nums.length;i++){
            result+=nums[i];
            if(result>max){
                max=result;
            }
            if(result<0){
                result=0;
            }
        }
        return max;
    }
}
