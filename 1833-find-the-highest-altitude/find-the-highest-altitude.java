class Solution {
    public int largestAltitude(int[] gain) {
        int curAltitude = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            curAltitude += g;
            if (curAltitude > maxAltitude) {
                maxAltitude = curAltitude;
            }
        }
        return maxAltitude;
    }
}