package Java_Code;

// Problem: check if a linked list is palindrome

public class LinkedListIsPalindrome {
    class LinkedNode {
        int data;
        LinkedNode next;

        LinkedNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // using hare turtle approach
    public LinkedNode findMiddle(LinkedNode head) {
    LinkedNode hare = head;
        LinkedNode turtle = head;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public LinkedNode reverse(LinkedNode head) {
        LinkedNode prev = null;
        LinkedNode curr = head;
        while (curr != null) {
            LinkedNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(LinkedNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        LinkedNode middle = findMiddle(head);
        LinkedNode secondHalfStart = reverse(middle.next);
        LinkedNode firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.data != secondHalfStart.data) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedListIsPalindrome list=new LinkedListIsPalindrome();
        LinkedNode head= list.new LinkedNode(1);
        head.next=list.new LinkedNode(2);
        head.next.next=list.new LinkedNode(3);
        head.next.next.next=list.new LinkedNode(4);
        head.next.next.next.next=list.new LinkedNode(1);
        System.out.println(list.isPalindrome(head));
    }
}
