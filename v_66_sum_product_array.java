public class v_66_sum_product_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sopfArray(arr);
    }

    static void sopfArray(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + "," + product);
    }
}
