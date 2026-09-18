class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double prefixSum = 0;
        double maxAvg = Double.MIN_VALUE;
        int i = 0;
        int j = 0;

        while(i < k){
            prefixSum += nums[i];
            i++;
        }
        maxAvg = prefixSum / k;

        while(i < nums.length){
            prefixSum -= nums[j];
            prefixSum += nums[i];
            maxAvg = Math.max(maxAvg, prefixSum/k);
            i++; j++;
        }
        return maxAvg;
    }
}