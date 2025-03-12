class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int arr[]=new int[heights.length];
        System.arraycopy(heights,0,arr,0,heights.length);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(heights[i]!=arr[i]) c++;
        }
        return c;
    }
}