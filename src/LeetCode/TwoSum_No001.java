package LeetCode;

import java.util.*;
public class TwoSum_No001 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0 ;i<numbers.length;i++){
            map.put(numbers[i],i);
        }
        for(int i = 0;i<numbers.length;i++){
            int remain = target - numbers[i];
            //两种case，一种是两个数相等，通过再找一遍来判断，因为map是一一映射关系，只可以保存一个位置
            if(remain==numbers[i]){
                for(int j = 0 ;j<numbers.length;j++){
                    if(numbers[j]==remain&&j!=i){
                        //找到了，记录
                        result[0]=i<j?i+1:j+1;
                        result[1]=i>j?i+1:j+1;
                        break;
                    }
                }
            }
            else{
                if(map.containsKey(remain)){
                    int j = map.get(remain);
                    result[0]=i<j?i+1:j+1;
                    result[1]=i>j?i+1:j+1;
                    break;
                }

            }
        }
        return result;
    }
}