class Solution {
    public int[] sortedSquares(int[] nums) {
       
       int[] res = new int[nums.length];
       for(int i=0;i<nums.length;i++) nums[i] = nums[i] * nums[i];

       int left = 0;
       int right = nums.length-1;
       int pos = nums.length-1;

       while(left <= right){
        if(nums[left] > nums[right]){
            res[pos] = nums[left];
            left++;
        }else{
            res[pos] = nums[right];
            right--;
        }
        pos--;
       }
       return res;
    }
}