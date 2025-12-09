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
    public ListNode rotateRight(ListNode head, int k) {
         if (head==null ||head.next==null||k==0){
            return head;
        }
        
        ListNode tail=head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }

        tail.next=head;

        k= k % length;
        int newrotate=length-k-1;

        ListNode newtail = head;

        for(int i = 0; i < newrotate; i++){
            newtail=newtail.next;
        }

        ListNode newHead = newtail.next;

        newtail.next=null;

        return newHead;
    }
}