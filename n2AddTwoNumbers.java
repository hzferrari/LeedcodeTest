import java.util.List;

/**2. Add Two Numbers
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and
 * each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8

 其实就是把两个数倒过来存进去，实际是342+465=807
 */
//Definition for singly-linked list.
/*class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class n2AddTwoNumbers {

    public static void main(String[] args){
        Solution a = new Solution();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(5);
        ListNode b = a.addTwoNumbers(l1, l2);
        System.out.println(b);
    }

}


class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newl = new ListNode(0);
        ListNode head = newl;   //记录新链表的头部
        int carry=0;    //进位
        int cursum;
        while (l1!=null || l2!=null){

            cursum = (l1==null?0:l1.val) + (l2==null?0:l2.val) + carry; //参考https://leetcode.com/discuss/73612/my-easy-java-solution
            carry = 0;
            if(cursum <10)
                newl.next = new ListNode(cursum);       //java中需要手动new链表的next
            else {
                newl.next = new ListNode(cursum % 10);
                carry = 1;
            }
            l1 = l1==null?l1:l1.next;
            l2 = l2==null?l2:l2.next;
            newl = newl.next;
        }
        if(carry == 1)
            newl.next = new ListNode(1);

        return head.next;   //newl.next才是我们要的头部
    }
}*/
