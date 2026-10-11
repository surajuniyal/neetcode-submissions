/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // create dummy node so that after cal we can update in next means actual Left node
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;

        //placing right pointer to nth element/node after start/left pointer
        while (n > 0 && right != null) {
            right = right.next;
            n--;
        }

        //Moving pointers till right points to null means after list end 
        // 1 -> 2 -> 3 -> null
        // when right pointer is in null the left will be n elemnet back coz they have n number distance[we achive in above loop]
        while (right != null) {
            left = left.next;
            right = right.next;
        }

        //[DELETE] we point next to next pointer removing link of node which we want to del

        left.next = left.next.next;

        return dummy.next;
    }
}
