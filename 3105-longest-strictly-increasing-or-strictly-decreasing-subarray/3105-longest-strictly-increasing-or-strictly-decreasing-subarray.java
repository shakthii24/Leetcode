class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increasing = 1, decreasing = 1, maxInc = 1, maxDec = 1;
        for(int i=0;i<nums.length;i++){
            if(i > 0){
                if(nums[i] > nums[i - 1]){
                    increasing++;
                    maxInc = Math.max(increasing, maxInc);
                }else{
                    increasing = 1;
                }
                if(nums[i] < nums[i - 1]){
                    decreasing++;
                    maxDec = Math.max(maxDec, decreasing);
                }else{
                    decreasing = 1;
                }
            }
        }
        return Math.max(maxInc,maxDec);
    }
}