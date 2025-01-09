package Java_Code;

// Problem: find and remove Nth Node From End of List
public class LinkedList_RemoveNthNode {
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode removeNthNode(int n, ListNode head) {
        if (head.next == null) {
            return null;
        }
        int size = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            size++;
        }
        // check if the node to be removed is the first node(head)
        if (n == size) {
            return head.next;
        }
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        LinkedList_RemoveNthNode list = new LinkedList_RemoveNthNode();
        ListNode head = list.new ListNode(1);
        head.next = list.new ListNode(2);
        head.next.next = list.new ListNode(3);
        head.next.next.next = list.new ListNode(4);
        head.next.next.next.next = list.new ListNode(5);

        int n = 2;
        head = list.removeNthNode(n, head);

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
