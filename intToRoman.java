class Solution {
    public String intToRoman(int num) {
        // Values in descending order (largest to smallest)
        
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        // Corresponding Roman numeral symbols for each value
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // StringBuilder to efficiently build the result string
        StringBuilder result = new StringBuilder();

        // Greedy approach: iterate through values from largest to smallest
        for (int i = 0; i < values.length; i++) {
            // While the current number is >= the current value, append its symbol
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        
        // Convert StringBuilder to string and return
        return result.toString();
    }
}