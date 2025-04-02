class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean b=true;
        for(int i=0;i<nums.length-1;i++){
                if(nums[i]%2==nums[i+1]%2) b=false;
                //return true;
        }
        return b;
    }
}