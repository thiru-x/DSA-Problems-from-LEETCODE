class Solution {
    public boolean check(int[] nums) {
        
        boolean res=false;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>(nums[(i+1)%nums.length])){
                if(res) return false;
                res=true;
            }
        }
        return true;

    }
}