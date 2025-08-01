class Solution {
    void findRow(int r, List<Integer> a) {
        int res = 1;
        a.add(res);
        for(int c = 1;c<r;c++) {
            res = res * (r-c);
            res = res / c;
            a.add(res);
        }
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int r=1;r<=numRows;r++) {
            List<Integer> a = new ArrayList<>();
            findRow(r,a);
            ans.add(a);
        }
        return ans;
    }
}