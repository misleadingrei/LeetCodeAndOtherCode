package LeetCode;

public class No66 {
    public int[] plusOne(int[] digits) {
        int lens = digits.length;
        List<Integer> list = new ArrayList<Integer>();
        int carry = 1;
        for(int i = lens-1;i>=0;i--){
            list.add((digits[i]+carry)%10);
            carry=(digits[i]+carry)/10;
        }
        if(carry==1){
            list.add(1);
        }
        int[] result = new int[list.size()];
        for(int i = 0;i<result.length;i++){
            result[i]=list.get(result.length-1-i);
        }
        return result;

    }
}
