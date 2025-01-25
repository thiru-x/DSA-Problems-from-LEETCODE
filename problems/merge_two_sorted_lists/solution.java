class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Use a for loop to iterate as long as neither l1 nor l2 is null
        for (; l1 != null && l2 != null; ) {
            if (l1.val < l2.val) {
                current.next = l1; // Add l1's node to the merged list
                l1 = l1.next;     // Move to the next node in l1
            } else {
                current.next = l2; // Add l2's node to the merged list
                l2 = l2.next;     // Move to the next node in l2
            }
            current = current.next; // Move the pointer in the merged list forward
        }

        // Attach the remaining nodes from l1 or l2
        current.next = (l1 != null) ? l1 : l2;

        // Return the merged list starting from the node after dummy
        return dummy.next;
    }
}
