import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" "); // Split the string into words
        
        if (pattern.length() != words.length) {
            return false; // Pattern and word count must match
        }
        
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            
            // Check if pattern character is already mapped to a word
            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word)) {
                    return false; // Mismatch in existing mapping
                }
            } else {
                charToWord.put(ch, word);
            }
            
            // Check if word is already mapped to a pattern character
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != ch) {
                    return false; // Mismatch in existing mapping
                }
            } else {
                wordToChar.put(word, ch);
            }
        }
        
        return true; // If all checks pass, pattern matches the string
    }
}
