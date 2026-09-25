class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int ones = 0;
        int maxWindow = 0;

        while(right < nums.length){
            ones += nums[right];

            int currentWindow = right - left + 1;

            while(currentWindow - ones > 1){
                ones -= nums[left];
                left++;
                currentWindow = right - left + 1;
            }

            maxWindow = Math.max(maxWindow, currentWindow - 1);

            right++;
        }
        return maxWindow;
    }
}