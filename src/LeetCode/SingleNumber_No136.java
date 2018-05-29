package LeetCode;


import java.util.ArrayList;

public class SingleNumber_No136 {
    public int singleNumber(int[] A) {
        int result = 0 ;
        for(int i = 0 ;i<A.length;i++){
            result ^= A[i];
        }
        return result;
        ArrayList<Integer> list = new ArrayList();
        Integer i = new Integer(1);
        list.remove(i);
    }


}
