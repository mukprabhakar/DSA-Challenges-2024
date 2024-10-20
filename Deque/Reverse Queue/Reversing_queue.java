import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    
    // Function to reverse the queue
    public static void reverseQueue(Queue<Integer> queue) {
        // Create a stack to hold the elements
        Stack<Integer> stack = new Stack<>();

        // Dequeue all elements from the queue and push them onto the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Pop all elements from the stack and enqueue them back into the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        // Input 1
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(4);
        queue1.add(3);
        queue1.add(1);
        queue1.add(10);
        queue1.add(2);
        queue1.add(6);

        System.out.println("Original Queue: " + queue1);
        reverseQueue(queue1);
        System.out.println("Reversed Queue: " + queue1);
        
        // Input 2
        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(4);
        queue2.add(3);
        queue2.add(2);
        queue2.add(1);

        System.out.println("Original Queue: " + queue2);
        reverseQueue(queue2);
        System.out.println("Reversed Queue: " + queue2);
    }
}
