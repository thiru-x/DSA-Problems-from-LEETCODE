class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] ans=new int[m][n];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int column=(j+k)%n; 
                int row=(i+(j+k)/n)%m;
                ans[row][column]=grid[i][j];
            }
        }
        List<List<Integer>> ans1=new ArrayList<>();
        for(int i=0;i<ans.length;i++){
            ans1.add(new ArrayList<Integer>());
            for(int j=0;j<ans[0].length;j++){
                ans1.get(i).add(ans[i][j]);
            }
        }
        return ans1;
    }
}
