class Solution {
    public int lengthOfLastWord(String s) {
        String nums[]=s.split(" ");
        int last=nums.length-1;
        return(nums[last].length());
    }
}
    