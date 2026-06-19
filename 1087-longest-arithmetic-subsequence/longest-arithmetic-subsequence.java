class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer>[] dp = new HashMap[n];
        for(int i=0; i<n; i++) {
            dp[i] = new HashMap<>();
        }
        
        int maxLen = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<i; j++) {
                int diff = nums[i] - nums[j];

                int prevLen = dp[j].getOrDefault(diff, 1);
                int currLen = prevLen + 1;

                dp[i].put(diff, Math.max(dp[i].getOrDefault(diff, 0), currLen));
                maxLen = Math.max(maxLen, currLen);
            }
        }
        return maxLen;
    }
}