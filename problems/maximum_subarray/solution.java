class Solution {
    public int maxSubArray(int[] arr) {
        int maximum=0;
        int n=arr.length;
        int fr=arr[0];
        for(int i=0;i<n;i++){
            if(maximum<0) maximum=0;
            maximum+=arr[i];
            fr=Math.max(maximum,fr);
        }
        return fr;
    }
}