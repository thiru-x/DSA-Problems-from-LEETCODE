import java.util.Collections;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //int max=Math.max(candies);
        int max = candies[0];
        for (int num : candies) {
            if (num > max) {
                max = num;
            }
        }
        ArrayList<Boolean> arr=new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                arr.add(true);
                
        }
        else{
            arr.add(false);
        }
    }
    return arr;
}
}