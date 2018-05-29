package LeetCode;

public class No8 {
    public int myAtoi(String str) {
        if(str==null||str.length()==0)return 0;
        int pos = 0 ;
        boolean neg = false;
        while(pos<str.length()&&(isSpace(str.charAt(pos)))){
            pos++;
        }
        if(pos==str.length())return 0;
        if(!isDigit(str.charAt(pos))){
            if(str.charAt(pos)=='+'||str.charAt(pos)=='-'){
                neg = str.charAt(pos)=='-'?true:false;
                pos++;
            }
            else return 0;
        }
        int result = 0 ;
        for(int i = pos ;(i<str.length())&&isDigit(str.charAt(i));i++){
            int val = (int)(str.charAt(i)-'0');
            //对于result*10作溢出检验,
            //这样做可以的原因是，如果乘作的是左移，而除法做的是逻辑右移，溢出的话明显会不一样
            int temp = result*10;
            if(temp/10!=result)return neg?Integer.MIN_VALUE:Integer.MAX_VALUE;
            //而对于加减法则不会产生这种问题，还是一样的，最多有个进位和借位flag
            result=temp+val;
            if((result&0x80000000)!=(temp&0x80000000)){
                return neg?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }

        }
        return neg? -result:result;
    }
    private boolean isDigit(char ch){
        return ch>='0'&&ch<='9';
    }
    private boolean isSpace(char ch){
        return ch==' ';
    }
}
