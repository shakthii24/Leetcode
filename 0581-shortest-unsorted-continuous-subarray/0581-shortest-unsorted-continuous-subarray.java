class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int i = 0;
        for(;i<nums.length-1;i++) if(nums[i] > nums[i+1]) break;

        if(i == nums.length-1) return 0;

        int j = nums.length-1;
        for(;j>0;j--) if(nums[j] < nums[j-1]) break;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int k=i;k<=j;k++){
            min = Math.min(min , nums[k]);
            max = Math.max(max , nums[k]);
        }
        
        int l = 0, m = nums.length-1;
        for(;l<nums.length;l++) if(nums[l] > min) break;
        for(;m>=0;m--) if(nums[m] < max) break;

        return m - l + 1;
    }
}