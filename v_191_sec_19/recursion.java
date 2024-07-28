public class Recursion {
    public void recursiveMethod(int n) {
        if (n < 1) {
            System.out.println("n is less than 1");
        } else {
            recursiveMethod(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.recursiveMethod(5);
    }
}
