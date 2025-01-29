class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int maxi=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        int high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            int hour=0;
            for(int i=0;i<n;i++){
                hour+=Math.ceil((double)piles[i]/(double)mid);
            }
            if(hour<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}