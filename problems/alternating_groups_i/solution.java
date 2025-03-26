class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n= colors.length;
        if(n<3){
            return 0;
        }
        int count=0;
        for(int i=0;i<n;i++){
            int pre = colors[i];
            int cur = colors[(i+1)%n];
            int nxt = colors[(i+2)%n];
            if(pre!=cur && cur!=nxt){
                count++;
            }

        }
        return count;
    }
}