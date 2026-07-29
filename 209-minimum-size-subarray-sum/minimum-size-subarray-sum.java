class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int left = 0;

        for(int r = 0; r < n; r++) {
            sum += nums[r];
            while (sum >= target) {
                minLen = Math.min(minLen, r - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        else return minLen;
    }
}