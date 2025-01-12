package Java_Code;

public class LinkedList_CycleDetection {
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode hare = head;
        ListNode turtle = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList_CycleDetection obj = new LinkedList_CycleDetection();
        ListNode head = obj.new ListNode(0);
        head.next = obj.new ListNode(1);
        head.next.next = obj.new ListNode(2);
        head.next.next.next = obj.new ListNode(3);
        head.next.next.next.next = obj.new ListNode(4);
        System.out.println(obj.hasCycle(head));
        head.next.next.next.next.next = head.next.next;
        System.out.println(obj.hasCycle(head));
    }
}
