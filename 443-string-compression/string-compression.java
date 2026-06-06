class Solution {
    public int compress(char[] chars) {
        int writeIndex = 0;
        int i = 0;
        int n = chars.length; 

        while (i < n) {
            int j = i;
            while (j < n && chars[j] == chars[i]) {
                j++;
            }

            int count = j - i;
            chars[writeIndex++] = chars[i];

            if(count > 1) {
                String countStr = String.valueOf(count);
                for(char c: countStr.toCharArray()) {
                    chars[writeIndex++] = c;
                }
            }
            i=j;
        }
        return writeIndex;
    }
}