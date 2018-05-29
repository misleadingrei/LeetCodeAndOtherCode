package LeetCode;

public class No344 {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        //string may feels like [高代理对][低代理对]
        for(int i = s.length()-1 ;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
