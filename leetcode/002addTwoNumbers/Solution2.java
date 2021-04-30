import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode h = new ListNode(0);
        ListNode p = h;
        int sum = 0;
        int val, carry= 0;
        while(l1 != null || l2 !=null){
            if(l1 != null){
                 sum += l1.val;
                 l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            val = sum % 10;
            carry = sum / 10;
            p.next = new ListNode(val);
            p = p.next;
            sum = 0;
            val = 0;
        }
        if(carry !=0){
            p.next = new ListNode(carry);
        }
        return h.next;
    }

    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2,4,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5,6,4));
        ListNode l1= new ListNode(0);
        ListNode p1 = l1;
        ListNode l2 = new ListNode(0);
        ListNode p2 = l2;
        for(int item : list1){
            p1.next = new ListNode(item);
            p1 = p1.next;
        }
        for(int item : list2){
            p2.next = new ListNode(item);
            p2 = p2.next;
        }
        l1 = l1.next;
        l2 = l2.next;
        ListNode l3 = s2.addTwoNumbers(l1,l2);
       // ArrayList<Integer> list3 = new ArrayList<>();
        while(l3 != null){
        //    list3.add(l3.val);
            System.out.println(l3.val);
            l3 = l3.next;
        }

    }
}
