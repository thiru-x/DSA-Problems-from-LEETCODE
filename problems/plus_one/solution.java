class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Return immediately if no carry is needed
            }
            digits[i] = 0; // Set to 0 and continue to propagate the carry
        }

        // If all digits were 9, create a new array with an extra leading 1
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
