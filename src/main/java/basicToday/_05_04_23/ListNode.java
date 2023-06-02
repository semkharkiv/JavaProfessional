package basicToday._05_04_23;



public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode() {
    }

    public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true;
                }
            }

            return false;
        }

    

    public static void main(String[] args) {

        ListNode l5 = new ListNode();
        ListNode l4 = new ListNode();
        ListNode l3 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l1 = new ListNode();

        l5.next = l3;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

    }
}
