package Java_Code;

import java.util.Stack;

import Java_Code.QueueCircularUsingArray.Queue;

public class QueueUsingTwoStack {
    public class QueueY {
        static class Queue {
            static Stack<Integer> s1 = new Stack<Integer>();
            static Stack<Integer> s2 = new Stack<Integer>();

            public static boolean isEmpty() {
                return s1.isEmpty();
            }

            public static void add(int data) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                s1.push(data);
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }

            public static int remove() {
                return s1.pop();
            }

            public static int peek() {
                return s1.peek();
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
