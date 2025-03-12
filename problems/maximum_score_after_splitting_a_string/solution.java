class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int one_count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') {one_count++;}
        }
    int zero_count=0;
    int max_score=0;
        for(int i=0;i<n-1;++i){
            if(s.charAt(i)=='1') {one_count--;}
            else {zero_count++;}
            max_score=Math.max(max_score,zero_count + one_count);
        }

        
return max_score;
    }
}