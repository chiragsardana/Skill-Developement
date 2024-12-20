public class StackWithPalindrome {

    // Stack Implementation
    static class Stack {
        private int[] stackArray;
        private int top;
        private int max;

        // Constructor
        public Stack(int max) {
            this.max = max;
            stackArray = new int[max];
            top = -1; // Stack is empty
        }

        // Push element onto stack
        public void push(int value) {
            if (top == max - 1) {
                System.out.println("Stack Overflow! Cannot push " + value);
                return;
            }
            stackArray[++top] = value;
        }

        // Pop element from stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! Stack is empty.");
                return -1;
            }
            return stackArray[top--];
        }

        // Peek at the top element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return stackArray[top];
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        Stack stack = new Stack(str.length());

        // Push all characters onto the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Check palindrome by popping from stack
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false; // Mismatch found
            }
        }

        return true; // No mismatches found
    }

    // Main method
    public static void main(String[] args) {
        // Stack usage example
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top of the stack: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top of the stack after pop: " + stack.peek());

        // Palindrome function example
        String testString = "madam";
        if (isPalindrome(testString)) {
            System.out.println(testString + " is a palindrome.");
        } else {
            System.out.println(testString + " is not a palindrome.");
        }
    }
}
