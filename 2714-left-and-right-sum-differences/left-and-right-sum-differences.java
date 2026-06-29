class Solution {
    public int[] leftRightDifference(int[] nums) {
        int k = nums.length;
        int answer[] = new int[k];
        int curr = 0;
        int total =0;
        for(int n : nums){
            total += n;

        }
        
        for(int i=0; i<nums.length; i++) {
            int leftSum = curr;
            curr += nums[i];
            int rightSum = total - curr;
            answer[i] = Math.abs(rightSum - leftSum);
        }
        return answer;
    }
}