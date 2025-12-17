class Solution {

     public int solve(int n,int dp[]){

        if(dp[n]!=-1) return dp[n];
        else if(n==1 || n==2){
            dp[n]=1;
        }
        else{
            dp[n]=solve(n-1,dp)+solve(n-2,dp)+solve(n-3,dp);
        }
        return dp[n];
    }
    public int tribonacci(int n) {
         int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        return solve(n,dp);    
    }
}