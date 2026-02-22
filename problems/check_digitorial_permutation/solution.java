import java.util.Arrays;

class Solution {

    public boolean isDigitorialPermutation(int n) {

        int pelorunaxi = n;
        int original = n;
        int sum = 0;

        while (pelorunaxi > 0) {
            int lastDigit = pelorunaxi % 10;
            sum += factorial(lastDigit);
            pelorunaxi /= 10;
        }

        return sortNumber(original).equals(sortNumber(sum));
    }

    private int factorial(int digit) {
        int result = 1;
        for (int i = 2; i <= digit; i++) {
            result *= i;
        }
        return result;
    }

    private String sortNumber(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}