public class CustomStack {
    private Node top;
    public int height;

    public CustomStack() {
        top = null;
        height = 0;
    }

    public Node pop() {
        if (height == 0) {
            return null;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

    public void push(Node node) {
        node.next = top;
        top = node;
        height++;
    }
}
