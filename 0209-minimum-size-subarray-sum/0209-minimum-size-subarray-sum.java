class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        while(right < nums.length){
            sum += nums[right];
            right++;

            if(sum >= target){
               while(sum >= target){
                sum -= nums[left];
                int length = right - left;
                minLength = Math.min(length, minLength);
                left++;
               }
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}