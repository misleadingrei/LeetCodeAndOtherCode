package LeetCode;

public class No88 {
    //既然从头开始排要移动数据，不妨考虑从末尾开始排
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos1 = m-1;
        int pos2 = n-1;
        for(int i = m+n-1;i>=0;i--){
            if(pos1>=0&&pos2>=0){
                if(nums1[pos1]>nums2[pos2])
                    nums1[i]=nums1[pos1--];
                else
                    nums1[i]=nums2[pos2--];

            }
            else{
                if(pos2>=0) nums1[i]=nums2[pos2--];
                else nums1[i]=nums1[pos1--];
            }
        }
    }
}
