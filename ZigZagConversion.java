public class ZigZagConversion {
    
    
    public String convert(String s, int numRows) {
        // Create array of StringBuilders, one for each row
        StringBuilder[] sbs = new StringBuilder[numRows];

        // Initialize each StringBuilder
        for(int i = 0; i < numRows; i++){
            sbs[i] = new StringBuilder();
        }

        // Convert input string to character array for easier access
        char[] arr = s.toCharArray();
        int n = arr.length;
        int index = 0;

        // Traverse the string following zigzag pattern
        while(index < n){
            // First for loop: go DOWN through rows (0 to numRows-1)
            for(int j = 0; j < numRows && index < n; j++){
                sbs[j].append(arr[index++]);
            }

            // Second for loop: go UP through rows (numRows-2 to 1)
            // Skip row 0 and numRows-1 to avoid duplicates
            for(int j = numRows - 2; j > 0 && index < n; j--){
                sbs[j].append(arr[index++]);
            }
        }

        // Combine all rows into final result
        StringBuilder res = sbs[0];
        for(int i = 1; i < numRows; i++){
            res.append(sbs[i].toString());
        }

        return res.toString();
    }
}

