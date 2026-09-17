class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = 0;
        int closest = Integer.MAX_VALUE;

        for(int i=0;i<nums.length-2;i++){
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return sum;
                }else if(sum < target){
                    j++;
                }else{
                    k--;
                }
                int difference = Math.abs(sum - target);
                if(difference < closest){
                    closest = difference;
                    min = sum;
                }
            }
        }
        return min;
    }
}