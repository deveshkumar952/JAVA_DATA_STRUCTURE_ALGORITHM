import java.util.Stack;

public class Exercise {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "{[()]}";
        boolean result = isBalanced(expression);
        System.out.println("Is the expression balanced? " + result);

        CustomStack customStack = new CustomStack();
        customStack.push(new Node(1));
        customStack.push(new Node(2));
        customStack.push(new Node(3));

        System.out.println("Popped element: " + customStack.pop().value);
        System.out.println("Popped element: " + customStack.pop().value);
        System.out.println("Popped element: " + customStack.pop().value);
    }
}
