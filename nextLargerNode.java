public class nextLargerNode {

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

    class Solution {
        public int[] nextLargerNodes(ListNode head) {

            int n = 0;
            ListNode l = head;
            while (l != null) {
                n++;
                l = l.next;
            }

            int arr[] = new int[n];
            int i = 0;

            ListNode temp = head;
            while (temp != null) {
                ListNode t = temp.next;
                boolean found = false;
                while (t != null) {
                    if (t.val > temp.val) {
                        arr[i++] = t.val;
                        found = true;
                        break;
                    }
                    t = t.next;
                }
                if (!found) {
                    arr[i++] = 0;
                }

                temp = temp.next;
            }
            return arr;

        }
    }
}
