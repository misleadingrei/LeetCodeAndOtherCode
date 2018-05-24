package LeetCode;

public class LinkedListCycle_No141 {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) return false;
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        // first will be ture if has no cycle
        // seoncd will be true if has cycle
        //which means whatever we will have false if first && second
        while(fast.next!=null&&fast!=slow){
            fast=fast.next.next;
            if(fast==null)return false;
            slow=slow.next;
        }
        if(fast.next==null) return false;
        else return true;

    }
}
