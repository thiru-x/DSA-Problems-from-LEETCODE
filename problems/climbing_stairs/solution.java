class Solution {


    public int solve(int n,int dp[]){
        if(dp[n]!=-1) return dp[n];
        if(n==1 || n==2){
            dp[n]=n;
        }
        else{
            dp[n]=solve(n-1,dp)+solve(n-2,dp);
        }

        return dp[n];
    }


    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        return solve(n,dp);
    }
}