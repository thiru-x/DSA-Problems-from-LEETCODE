class Solution {
    public String addSpaces(String s, int[] spaces) {
    StringBuilder sb = new StringBuilder(s);
        int offset = 0;

        for (int index : spaces) {
            sb.insert(index + offset, ' ');
            offset++; 
        }
        
        return sb.toString();
    }
}