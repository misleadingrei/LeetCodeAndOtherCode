package LeetCode;

import java.util.Stack;

public class EvaluateReversePolishNotation_No150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ns = new Stack<>();
        for(String string : tokens)
        {
            if(isNum(string))
            {
                ns.push(Integer.parseInt(string));
            }
            else
            {
                int result =caculate(string,ns);
                ns.push(result);

            }
        }
        return ns.pop();
    }
    private boolean isNum(String s)
    {
        if("+".equals(s)||"/".equals(s)||"-".equals(s)||"*".equals(s))
            return false;
        return true;
    }
    private int caculate (String op,Stack<Integer> ns)
    {
        int num1 = ns.pop();
        int num2 = ns.pop();
        if("+".equals(op))
        {
            return num2+num1;
        }
        if("/".equals(op))
        {
            return num2/num1;
        }
        if("-".equals(op))
        {
            return num2-num1;
        }
        return num2*num1;

    }
}
