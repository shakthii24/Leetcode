class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i : nums) total += i;

        int current = 0;
        for(int i=0;i<nums.length;i++){
            current += nums[i];
            int left = current - nums[i];
            int right = total - current;
            if(left == right) return i;
        }
        return -1;
    }
}