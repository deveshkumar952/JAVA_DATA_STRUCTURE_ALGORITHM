
public class Main {
    public static void main(String[] args) {
    SingleDimensionArray sda = new SingleDimensionArray(10);
    sda.insert(0, 10);
    sda.insert(1, 20);
    sda.insert(2, 30);
    sda.insert(3, 40);
    sda.insert(12, 50);
    var first = sda.arr[0];
    System.out.println(first);
    var second = sda.arr[1];
    var third =sda.arr[2];
    System.out.println(third);
    System.out.println(second);

        System.out.println("Array Traversal");
        sda.traverseArray();

        sda.searchArray(20);
        sda.searchArray(88);

        sda.deleteValue(1);
        sda.traverseArray();     
    }
}
