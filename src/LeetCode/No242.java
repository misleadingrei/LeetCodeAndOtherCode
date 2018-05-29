package LeetCode;

public class No242 {
    public boolean isAnagram(String s, String t) {
        if(s==null||t==null)return true;
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            int index = (int)(s.charAt(i)-'a');
            count[index]++;
        }
        for(int i=0;i<t.length();i++){
            int index = (int)(t.charAt(i)-'a');
            count[index]--;
        }
        for(int val : count){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}
