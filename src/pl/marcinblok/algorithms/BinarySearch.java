package pl.marcinblok.algorithms;

public class BinarySearch {

    // Time complexity O(log N)
    static int findIndexWithBinarySearch(int[] array, int target) {
        int left = array[0];
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (target < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] sortedArray = {-7, 2, 5, 9, 14, 27, 33, 99, 237};
        int target = 33;
        System.out.println(findIndexWithBinarySearch(sortedArray, target));
    }
}
