class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] unicode = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            unicode[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            unicode[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (unicode[i] != 0) {
                return false;
            }
        }
        return true;
    }
}