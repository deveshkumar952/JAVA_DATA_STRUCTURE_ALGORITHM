package v_147_sec_15_stack;

class Main {
    public static void main(String[] args) {
    Stack newStack = new Stack(4);
    // boolean result1 = newStack.isEmpty();
    // System.out.println(result1);
    // boolean result = newStack.isFull();
    // System.out.println(result);
    newStack.push(1);
    newStack.push(2);
    newStack.push(3);
    // int result2 = newStack.pop();
    // System.out.println(result2);
    // int result3 = newStack.peek();
    // System.out.println(result3);
    newStack.deleteStack();
    }
}
