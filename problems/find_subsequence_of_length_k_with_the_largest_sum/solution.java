class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] arr = new int[n][k]; // [value, index]
        for (int i = 0; i < n; i++) arr[i] = new int[]{nums[i], i};

        // Sort by value (descending)
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        // Take top k elements
        int[][] topK = Arrays.copyOfRange(arr, 0, k);

        // Sort top k by original index
        Arrays.sort(topK, Comparator.comparingInt(a -> a[1]));

        // Extract values
        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = topK[i][0];
        return result;
    }
    }
