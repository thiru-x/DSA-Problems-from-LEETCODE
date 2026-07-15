class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = 0;
        int even= 0;

        odd=n*(n+1);
        even=n*n;
        return n;
    }

    /* private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; }*/
    
}   