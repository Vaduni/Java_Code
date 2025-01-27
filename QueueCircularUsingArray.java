package Java_Code;

public class QueueCircularUsingArray {
    public static class Queue {
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int n) {
            this.size = n;
            arr = new int[size];
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // enqueue - O(1)
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full.");
            }
            // single element condition
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // dequeue - O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
            }
            // single element condition
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek -O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
