public class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) set.add(num); 

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) result.add(i);
        }

        return result;
    }
}