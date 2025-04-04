class Solution {
    public boolean canAliceWin(int[] nums) {
        boolean ans=false;
        int sd=0;
        int dd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
            sd+=nums[i];}
            else if(nums[i]>=10){
                dd+=nums[i];
            }
        }
        if(sd!=dd) ans=true;
            return ans;
    }
}