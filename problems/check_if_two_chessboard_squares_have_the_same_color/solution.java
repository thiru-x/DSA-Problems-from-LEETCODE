class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int f=coordinate1.charAt(0)-'a'+coordinate1.charAt(1)-'1';
         int s=coordinate2.charAt(0)-'a'+coordinate2.charAt(1)-'1';
         if((s-f)%2==0){
            return true;
         }else{
            return false;
         }
        
    }
}