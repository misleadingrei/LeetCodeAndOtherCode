package LeetCode;

public class No19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode pos1 =head,pos2 = head,pre=dummy;
        for(int i = 0 ;i<n;i++){
            pos1=pos1.next;
        }
        while(pos1!=null){
            pos1=pos1.next;
            pos2=pos2.next;
            pre=pre.next;
        }
        pre.next=pos2.next;
        return dummy.next;
    }
}
