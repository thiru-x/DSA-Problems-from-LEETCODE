class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (true) {
            boolean r = false;
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i))) {
                    for (int j = i - 1; j >= 0; j--) {
                        if (!Character.isDigit(sb.charAt(j))) {
                            sb.deleteCharAt(i); sb.deleteCharAt(j);
                            r = true; break;
                        }
                    }
                    if (r) break;
                }
            }
            if (!r) break;
        }
        return sb.toString();
    }
}