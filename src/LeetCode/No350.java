package LeetCode;

public class No350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ;i<nums1.length;i++){
            map1.put(nums1[i],map1.containsKey(nums1[i])?map1.get(nums1[i])+1:1);
        }
        for(int i = 0 ;i<nums2.length;i++){
            map2.put(nums2[i],map2.containsKey(nums2[i])?map2.get(nums2[i])+1:1);
        }
        for(int i = 0;i<nums1.length;i++){
            if(map1.containsKey(nums1[i])&&map2.containsKey(nums1[i])){
                if(map1.get(nums1[i])==1) map1.remove(nums1[i]);
                else map1.put(nums1[i],map1.get(nums1[i])-1);
                if(map2.get(nums1[i])==1) map2.remove(nums1[i]);
                else map2.put(nums1[i],map2.get(nums1[i])-1);
                list.add(nums1[i]);
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0 ;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result ;
    }
}
