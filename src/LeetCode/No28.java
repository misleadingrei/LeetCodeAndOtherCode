package LeetCode;

public class No28 {
    public int strStr(String haystack, String needle) {
        if(needle==null||needle.length()==0)return 0;
        for(int i = 0 ;i<=haystack.length()-needle.length();i++){
            int j = 0 ;
            for( ;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            // a succes find
            if(j==needle.length()) return i;
        }
        return -1;
    }
}
