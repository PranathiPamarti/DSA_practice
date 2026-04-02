class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray1 = s.toCharArray(); // Convert string to char array
        char[] charArray2 = t.toCharArray(); // Convert string to char array
        Arrays.sort(charArray1); // Sort the char array
        Arrays.sort(charArray2); // Sort the char array
        return new String(charArray1).equals(new String(charArray2));
    }
        
}

