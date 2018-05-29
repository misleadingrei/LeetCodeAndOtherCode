package LeetCode;

public class No21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode pos = dummy;
        while(l1!=null||l2!=null){
            if(l1!=null&&l2!=null){
                if(l1.val<=l2.val){
                    ListNode node = new ListNode(l1.val);
                    pos.next=node;
                    pos=pos.next;
                    l1=l1.next;
                }else{
                    ListNode node = new ListNode(l2.val);
                    pos.next=node;
                    pos=pos.next;
                    l2=l2.next;
                }
            }
            else if(l1==null){
                ListNode node = new ListNode(l2.val);
                pos.next=node;
                pos=pos.next;
                l2=l2.next;
            }
            else {
                ListNode node = new ListNode(l1.val);
                pos.next=node;
                pos=pos.next;
                l1=l1.next;
            }
        }
        return dummy.next;
    }
}
