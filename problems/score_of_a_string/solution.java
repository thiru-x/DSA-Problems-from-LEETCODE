class Solution {
    public int scoreOfString(String s) {
        int sum=0,diff=0;
            char arr[]=s.toCharArray();
            for(int i=0;i<s.length()-1;i++){
            diff=Math.abs(arr[i]-arr[i+1]);
            sum+=diff;
        }
        return sum;
    }
}