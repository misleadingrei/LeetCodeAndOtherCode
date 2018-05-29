package LeetCode;

public class No125 {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0) return true;
        int lo = 0;
        int hi = s.length()-1;
        while(lo<=hi){
            while(lo<=hi&&!isValid(s.charAt(lo)))lo++;
            while(lo<=hi&&!isValid(s.charAt(hi)))hi--;
            if(lo>hi) return true;
            char ch1 = s.charAt(lo++);
            char ch2 = s.charAt(hi--);
            if(!isEqual(ch1,ch2)){
                return false;
            }
        }
        return true;

    }
    private boolean isEqual(char ch1,char ch2){
        return Character.toUpperCase(ch1)==Character.toUpperCase(ch2);
    }
    private boolean isValid(char ch1){
        return (ch1>='0'&&ch1<='9')||(ch1>='a'&&ch1<='z')||(ch1>='A'&&ch1<='Z');
    }
}
