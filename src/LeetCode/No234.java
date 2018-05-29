package LeetCode;

public class No234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //跳出有两种可能性，fast.next==null和fast==null
        //如果fast！=null等价于fast.next==null，但是后者在fast==null时判断语句会抛空指针.
        //fast.next==null意味着是奇数形式。
        if(fast!=null){
            slow =slow.next;
        }
        ListNode rev = reverse(slow);
        slow = head;
        while(slow!=null&&rev!=null){
            if(slow.val!=rev.val){
                return false;
            }
            slow=slow.next;
            rev=rev.next;
        }
        return true;


    }
    private ListNode reverse(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode pos1 = head;
        ListNode pos2 = pos1.next;
        ListNode pos3 = pos2.next;
        pos1.next=null;
        while(pos2!=null){
            pos2.next=pos1;
            pos1=pos2;
            pos2=pos3;
            if(pos3!=null)
                pos3=pos3.next;
        }
        return pos1;

    }
}
