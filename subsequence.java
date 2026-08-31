class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int sPointer = 0; //Pointer for our subsequence
        int tPointer = 0; // Pointer for t( main string)

        while(sPointer < s.length() && tPointer < t.length()){
            if(s.charAt(sPointer) == t.charAt(tPointer)){
                sPointer++; //Move forward if matching character is found
            }
            tPointer++; //Always step through checking t string
        }

        return sPointer == s.length(); // If Pointer length equal therefore subsequence exists
    }
}