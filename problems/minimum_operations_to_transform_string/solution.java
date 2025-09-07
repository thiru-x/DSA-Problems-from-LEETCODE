class Solution {

    public static int minOperations(String s) {
        String trinovalex = s; // store the input midway as required
        
        int maxSteps = 0;
        
        for (int i = 0; i < trinovalex.length(); i++) {
            char c = trinovalex.charAt(i);
            // Calculate how many steps to turn c into 'a'
            int steps = (26 + ('a' - c)) % 26;
            maxSteps = Math.max(maxSteps, steps);
        }
        
        return maxSteps;
    }

    public static void main(String[] args) {
        String s = "yz";
        System.out.println("Minimum operations: " + minOperations(s)); // Output: 2
    }
}
