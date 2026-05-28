class Solution {
    public int strStr(String haystack, String needle) {
        int a = haystack.length();
        int b = needle.length();

        if (b > a) { 
            return - 1;
        }
        for(int i = 0; i <= a - b; i++) {
            boolean found = true; 
            for (int j=0; j<b; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if(found) {
                return i;
            }
        }
        return -1;
    }
}