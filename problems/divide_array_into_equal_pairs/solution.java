class Solution {
    public boolean divideArray(int[] nums) {
       int n=nums.length/2;
       int arr[]=new int[n*2];
       Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i+=2){
       if(nums[i]!=nums[i+1]) return false; 
    }
    return true;
    }
}