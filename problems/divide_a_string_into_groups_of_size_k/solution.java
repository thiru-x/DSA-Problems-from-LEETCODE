import java.util.*;

class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < n) {
            int end = Math.min(i + k, n);
            String temp = s.substring(i, end);

            if (temp.length() < k) {
                int remain = k - temp.length();
                StringBuilder sb = new StringBuilder(temp);
                for (int j = 0; j < remain; j++) {
                    sb.append(fill);
                }
                temp = sb.toString();
            }

            result.add(temp);
            i += k;
        }
        return result.toArray(new String[0]);
    }
}
