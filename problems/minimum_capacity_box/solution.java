class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int ans = -1;
        int minCap = Integer.MAX_VALUE;

        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize) {
                if (capacity[i] < minCap) {
                    minCap = capacity[i];
                    ans = i;
                }
            }
        }
        return ans;
    }
}