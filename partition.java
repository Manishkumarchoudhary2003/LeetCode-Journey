public class partition {
 
  public class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode partition(ListNode head, int x) {

        if (head == null || head.next == null) {
        return head;
        }

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        // ListNode temp = head;
        ListNode o = one;
        ListNode t = two;

        while (head != null) {
            if (head.val < x) {
                o.next = head;
                o = o.next;
            } else {
                t.next = head;
                t = t.next;
            }
            head = head.next;
        }

        // one = one.next;
        // two = two.next;
        o.next = two.next;
        t.next = null;
        return one.next;
    }
}
}
