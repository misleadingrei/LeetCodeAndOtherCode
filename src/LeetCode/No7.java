package LeetCode;

public class No7 {
    public int reverse(int x) {
        int temp =x;
        int result = 0 ;
        while(temp!=0){
            int remain = temp%10;
            //通过比较乘十在除以10和原始值之间是否相等来得到是否已经溢出了
            //溢出只有问题的，溢出可能是正的也可能是负的
            if(result*10/10!=result){
                return 0 ;
            }
            result = result*10+remain;
            temp=temp/10;
        }
        return result;
    }
}
