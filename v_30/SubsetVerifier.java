// import java.util.ArrayList;
// import java.util.List;

// public class SubarrayGenerator {

//     public static List<List<Integer>> generateSubarrays(int[] numbers) {
//         List<List<Integer>> subarrays = new ArrayList<>();
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i; j < numbers.length; j++) {
//                 List<Integer> subarray = new ArrayList<>();
//                 for (int k = i; k <= j; k++) {
//                     subarray.add(numbers[k]);
//                 }
//                 subarrays.add(subarray);
//             }
//         }
//         return subarrays;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         List<List<Integer>> subarrays = generateSubarrays(arr);
//         for (List<Integer> subarray : subarrays) {
//             System.out.println(subarray);
//         }
//     }
// }
public class SubsetVerifier {

    public static boolean isValidSubset(int[] array, int[] subset) {
        int arrayIndex = 0, subsetIndex = 0;

        while (arrayIndex < array.length && subsetIndex < subset.length) {
            if (array[arrayIndex] == subset[subsetIndex]) {
                subsetIndex++;
            }
            arrayIndex++;
        }

        return subsetIndex == subset.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] validSubset = {1, 3, 5};
        int[] invalidSubset = {1, 4, 2};

        System.out.println(isValidSubset(array, validSubset)); // Should print true
        System.out.println(isValidSubset(array, invalidSubset)); // Should print false
    }
}
