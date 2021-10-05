package pl.marcinblok.algorithms;
public class MaxContiguousSubarraySum {

    // Time complexity O(n)
    static int max_contiguous_subarray_sum(int[] array){
        int max_sum = array[0];
        int current_value = max_sum;
        for (int i = 1; i < array.length; i++){
            current_value = Math.max(array[i] + current_value, array[i]);
            max_sum = Math.max(current_value, max_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {

        int[] array = {2,5,-4,2};
        System.out.println("Max contiguous subarray sum of given array is: " + max_contiguous_subarray_sum(array));
    }
}
