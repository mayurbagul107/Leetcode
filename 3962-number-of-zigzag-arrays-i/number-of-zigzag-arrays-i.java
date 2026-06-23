class Solution {
    static final int MOD = 1000000007;
    public int zigZagArrays(int n, int l, int r) {
        int m = r - l +1;
        long[] up = new long[m];
        long[] down = new long[m];

        for(int i=0; i<m; i++) {
            down[i] = m - i - 1;
            up[i] = i;
        }
        for(int len = 3; len <= n; len++) {
            long[] newUp = new long[m];
            long[] newDown = new long[m];

            long[] prefixUp = new long[m + 1];
            long[] prefixDown = new long[m + 1];

            for(int i=0; i<m; i++) {
                prefixUp[i+1] = (prefixUp[i] + up[i]) % MOD;
                prefixDown[i+1] = (prefixDown[i] + down[i]) % MOD;
            }
            for(int x=0; x<m; x++) {
                newUp[x] = prefixDown[x];
                newDown[x] = (prefixUp[m] - prefixUp[x + 1] + MOD) % MOD;
            }
            up = newUp;
            down = newDown;
        }
        long ans = 0;
        for(int i=0; i<m; i++) {
            ans = (ans + up[i]) % MOD;
            ans = (ans + down[i]) % MOD;
        }
        return (int) ans;
    }
}