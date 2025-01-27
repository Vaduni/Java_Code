package Java_Code;

public class QueueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void enqueue(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                tail = head = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int front = head.data;
                if (head == tail) {
                    tail = null;
                }
                head = head.next;
                return front;
            }
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue.enqueue(1);
        Queue.enqueue(2);
        Queue.enqueue(3);
        Queue.enqueue(4);
        Queue.enqueue(5);
        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.dequeue();
        }

    }
}
