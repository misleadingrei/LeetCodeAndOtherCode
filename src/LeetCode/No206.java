package LeetCode;

public class No206 {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode pos = head;
        while(pos!=null){
            stack.push(pos);
            pos=pos.next;
        }
        ListNode dummy = new ListNode(0) ;
        ListNode pre =dummy;
        while(!stack.isEmpty()){
            pre.next=stack.pop();
            pre=pre.next;
        }
        //注意最后一个结点应该要赋null，不然会形成环，对于新建的结点则不会
        pre.next=null;
        return dummy.next;
        //三个指针，逐个翻转，O（1）空间，O（N）时间
    }
}
