public class ReorderLinkedList {

    class Solution {
        public class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }

        public ListNode reverse(ListNode rev) {
            if (rev.next == null)
                return rev;

            ListNode newHead = reverse(rev.next);
            rev.next.next = rev;
            rev.next = null;

            return newHead;
        }

        public void reorderList(ListNode head) {
            if (head == null || head.next == null) {
                return;
            }
            ListNode slow = head;
            ListNode fast = head;
            ListNode left = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode rev = reverse(slow);

            while (rev.next != null) {
                ListNode temp1 = left.next;
                ListNode temp2 = rev.next;

                left.next = rev;
                rev.next = temp1;

                left = temp1;
                rev = temp2;
            }
        }
    }
}
