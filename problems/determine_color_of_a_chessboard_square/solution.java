class Solution {
    public boolean squareIsWhite(String coordinates) {
        int n=(coordinates.charAt(0)-97)+(coordinates.charAt(1));
        return n%2==0;
    }
}