class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num: nums1) {
            set1.add(num);
        }
        for(int num: nums2) {
            set2.add(num);
        }

        List<Integer> result = new ArrayList<>();
        for(int num: set1) {
            if(set2.contains(num)) {
                result.add(num);
            }
        }
        int[] ans = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}