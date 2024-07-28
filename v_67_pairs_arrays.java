public class v_67_pairs_arrays {
    // Create a function which prints to the console the pairs from the given array
    // [1, 3, 4, 5] = [1, 3], [1, 4], [1, 5], [3, 4], [3, 5], [4, 5]

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        printPairs(arr);
    }

    static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}
