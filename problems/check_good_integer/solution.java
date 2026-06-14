class Solution {
    public boolean checkGoodInteger(int n) {
        int temp=n;
        int digitsum=0;
        while(n>0){
            int res=n%10;
            digitsum+=(res);
            n/=10;
        }
        
        int squaresum=0;
        while(temp>0){
            int rem=temp%10;
            squaresum+=(rem*rem);
            temp/=10;
        }
        if((squaresum-digitsum)>=50){
            return true;
        }
        return false;
        
    }
}