package LeetCode;

public class No38 {
    public String countAndSay(int n) {
        if(n==1) return "1";
        StringBuilder pre = new StringBuilder();
        pre.append("1");
        for(int i = 2 ;i<=n;i++){
            char base = pre.charAt(0);
            int  count = 0;
            //对于动态扩容的一些结构，你应该采取一个某一个时刻的值
            int  len = pre.length();
            StringBuilder now = new StringBuilder();
            for(int j = 0 ;j<len;j++){
                if(base==pre.charAt(j)){
                    count++;
                }else{
                    now.append(String.valueOf(count));
                    now.append(base);
                    base=pre.charAt(j);
                    count=1;
                }
                if(j==pre.length()-1){
                    now.append(String.valueOf(count));
                    now.append(base);
                }
            }
            pre=now;
        }
        return pre.toString();
    }
}
