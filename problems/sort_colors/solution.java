class Solution {
    public void sortColors(int[] nums) {
        
        ArrayList<Integer> zero = new ArrayList<>();
        ArrayList<Integer> ones = new ArrayList<>();
        ArrayList<Integer> twos = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                 zero.add(nums[i]);
            }else if(nums[i] == 1){
                ones.add(nums[i]);
            }else{
                twos.add(nums[i]);
            }
        }

        List<Integer> combined = new ArrayList<>();

        // Append all lists
        combined.addAll(zero);
        combined.addAll(ones);
        combined.addAll(twos);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = combined.get(i);
        }

    }
}