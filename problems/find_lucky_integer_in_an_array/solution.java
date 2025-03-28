class Solution {
    public int findLucky(int[] arr) {
        int temp[]=new int[501];
        for(int i: arr) temp[i]++;
        int count=-1;
        for(int i=1;i<temp.length;i++){
            //for(int j=1;j<nums.length;j++){
                if(i==temp[i]) count=i;
            //}
        }
        return count;
    }
}