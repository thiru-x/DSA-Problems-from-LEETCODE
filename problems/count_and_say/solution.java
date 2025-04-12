class Solution {
    public String countAndSay(int n) {
        // Handle edge case: if n <= 0, return empty string
        if(n <= 0){ return "" ;}
        // Base case: if n == 1, return "1"
        else if(n == 1){ return "1"; }
        // Initialize starting string as "1"
        String s = "1";
        // Counter to track number of iterations
        int count = 1;
        // Loop until we reach the nth term
        while(count != n){
            s = RLE(s);
            count++;
        }
        return s;
    }
    
    public String RLE(String a){
        // Initialize result string for the next term
        String result = "";
        // i tracks the start of current digit group, j scans ahead, count tracks occurrences
        int i = 0; int j = 0; int count = 0;
        // Process the entire string
        while(j < a.length()){
            // If current and next characters match, increment count and move j
            if(a.charAt(i) == a.charAt(j)){ count++; j++; }
            // When digits differ or end is reached, append count and digit to result
            if(j == a.length() || a.charAt(i) != a.charAt(j)){
                String temp = "" + count + a.charAt(i);
                result = result + temp;
                i = j; count = 0;
            }
        }
        return result;
    }
}