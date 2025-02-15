class Solution {
    public int[][] matrixReshape(int[][] arr, int r, int c) {

        if (arr.length * arr[0].length != r * c) {
            return arr;
        }
        int[][] ans = new int[r][c];
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                ans[row][col] = arr[i][j];
                col++;
                if (col == c) {
                    row++;
                    col = 0;
                }
            }

           
        }
        return ans;
    }
}