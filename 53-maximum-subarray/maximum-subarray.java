class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++) {
            //currentSum = Math.max(nums[i],currentSum + nums[i]);
           // maxSum = Math.max(maxSum, currentSum);

           if (currentSum + nums[i] > nums[i]) {
                currentSum = currentSum + nums[i];
           }
           else {
            currentSum = nums[i];
           }
           if (currentSum > maxSum) {
            maxSum = currentSum;
           }
        }
        return maxSum;
    }
}