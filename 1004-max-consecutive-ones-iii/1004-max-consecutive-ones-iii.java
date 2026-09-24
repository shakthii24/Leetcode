class Solution {
    public int longestOnes(int[] nums, int k) {
        int frequency = 0;
        int right = 0;
        int left = 0;
        int maxWindowSize = 0;

        while(right < nums.length){
            frequency += nums[right];

            int currentWindowSize = right - left + 1;

            while(currentWindowSize - frequency > k){
                frequency -= nums[left];
                left++;
                currentWindowSize = right - left + 1;
            }

            if(currentWindowSize - frequency <= k){
                maxWindowSize = Math.max(maxWindowSize, currentWindowSize);
            }

            right++;
        }
        
        return maxWindowSize;
    }
}