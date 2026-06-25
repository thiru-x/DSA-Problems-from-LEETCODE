class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            freq.clear();

            for (int j = i; j < n; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);

                int len = j - i + 1;

                if (freq.getOrDefault(target, 0) > len / 2) {
                    ans++;
                }
            }
        }

        return ans;
    }
}