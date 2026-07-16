class Solution {
public:
    long long gcdSum(vector<int>& nums) {
        long long ans=0;
        int mx=0;
        int n=nums.size();
        vector<int> prefix(n);
        for(int i=0;i<n;i++){
            if(nums[i]>mx){
                mx=nums[i];
            }
            prefix[i]=gcd(mx,nums[i]);
        }
        sort(prefix.begin(),prefix.end());
        int l=0,r=n-1;
        while(l<r){
            ans+=gcd(prefix[l],prefix[r]);
            l++;
            r--;
        }
        return ans;
    }
    int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
};