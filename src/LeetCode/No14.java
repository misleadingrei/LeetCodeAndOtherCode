package LeetCode;

public class No14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0) return "";
        StringBuilder sb = new StringBuilder();
        int len =Integer.MAX_VALUE;
        for(int i = 0 ;i<strs.length;i++){
            if(len>strs[i].length()){
                len=strs[i].length();
            }
        }
        for(int i = 0 ;i<len;i++){
            int index = 0;
            char base = 0 ;
            for(int j = 0 ;j<strs.length;j++){
                if(j==0) base = strs[j].charAt(i);
                if(base!=strs[j].charAt(i)) return sb.toString();
            }
            sb.append(base);
        }
        return sb.toString();
    }
}
