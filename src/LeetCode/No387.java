package LeetCode;

public class No387 {
    public int firstUniqChar(String s) {
        // 用一个小的表来表示出现次数
        int[] count  = new int[26];
        for(int i = 0 ;i<s.length();i++){
            int index = (int)(s.charAt(i)-'a');
            count[index]++;
        }
        for(int i = 0 ;i <s.length();i++){
            int index = (int)(s.charAt(i)-'a');
            if(count[index]==1){
                return i;
            }
        }
        return -1;
    }
}
