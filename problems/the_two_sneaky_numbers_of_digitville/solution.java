class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int []arr=new int[2];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) 
            arr[count++]=nums[i];
        }
        return arr;
    }
}