class Solution {
    public int majorityElement(int[] nums) {
        //Moore's voting algorithm
        int majority = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                majority = nums[i];
                count = 1;
            }
            else{
                count += (nums[i] == majority) ? 1 : -1;
            }
        }
        return majority;
    }
}