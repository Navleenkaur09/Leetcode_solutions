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
    public ListNode middleNode(ListNode head) {

        // Step 1: Convert Linked List to ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

    
        int mid = arr.size() / 2;

        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = mid; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }

        
        return dummy.next;
    }
}