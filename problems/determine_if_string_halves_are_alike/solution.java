class Solution {
    public boolean halvesAreAlike(String s) {
        int v1=0;
        int v2=0;
        int mid = s.length() / 2;
        String a = s.substring(0, mid);
        String b = s.substring(mid);
        
    	for (int i = 0; i <s.length(); i++) {
    		if( i < mid && isVowel(s.charAt(i))) {
    			v1++;
    		}else if( i >= mid && isVowel(s.charAt(i))) {
    			v2++;
    		}	
		} return v1 == v2;
    }
 public boolean isVowel(char c) {
    	return "aeiouAEIOU".indexOf(c) != -1;
    }
}
