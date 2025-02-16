import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Step 1: Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Step 2: Remove duplicates from both arrays
        int[] uniqueNums1 = removeDuplicates(nums1);
        int[] uniqueNums2 = removeDuplicates(nums2);

        // Step 3: Find differences using two-pointer technique
        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        int i = 0, j = 0;
        while (i < uniqueNums1.length && j < uniqueNums2.length) {
            if (uniqueNums1[i] < uniqueNums2[j]) {
                diff1.add(uniqueNums1[i]);
                i++;
            } else if (uniqueNums1[i] > uniqueNums2[j]) {
                diff2.add(uniqueNums2[j]);
                j++;
            } else {
                i++;
                j++;
            }
        }

        // Step 4: Add remaining elements
        while (i < uniqueNums1.length) {
            diff1.add(uniqueNums1[i]);
            i++;
        }

        while (j < uniqueNums2.length) {
            diff2.add(uniqueNums2[j]);
            j++;
        }

        // Step 5: Return the result as a list of lists
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(diff1);
        answer.add(diff2);
        return answer;
    }

    // Helper method to remove duplicates from a sorted array
    private int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) return arr;

        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, index);
    }
}
