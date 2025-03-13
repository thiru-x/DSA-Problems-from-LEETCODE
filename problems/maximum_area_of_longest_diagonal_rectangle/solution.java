class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0, maxdiag = 0;
        for (int[] dim: dimensions) {
            int diag = dim[0]*dim[0] + dim[1]*dim[1];
            if (diag > maxdiag) {
                maxArea = dim[0]*dim[1];
                maxdiag = diag;
            }
            else if (diag == maxdiag) maxArea = Math.max(maxArea, dim[0]*dim[1]);
        }
        return maxArea;
    }
}