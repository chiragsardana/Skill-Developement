import java.util.Stack;

public class PostfixEvaluation {
    // Method to evaluate a postfix expression
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        // Split the expression into tokens
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                // Pop the top two elements for the operation
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(token, operand1, operand2);
                stack.push(result);
            } else {
                // Push the number onto the stack
                stack.push(Integer.parseInt(token));
            }
        }
        // Final result will be the last element in the stack
        return stack.pop();
    }

    // Helper method to check if a token is an operator
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%") || token.equals("^");
    }

    // Helper method to perform the operation
    private static int performOperation(String operator, int operand1, int operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "%":
                return operand1 % operand2;
            case "^":
                return (int) Math.pow(operand1, operand2);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String postfixExpression = "5 3 2 * + 8 -"; // Example: (5 + (3 * 2)) - 8
        int result = evaluatePostfix(postfixExpression);
        System.out.println("The result of the postfix expression is: " + result);
    }
}
