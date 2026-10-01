class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] res = new int[nums.length];
       for(int i=nums.length-1;i>=0;i--)
       res[i] = (i == nums.length - 1) ? nums[i] : nums[i] * res[i + 1];

       int leftProduct = 1;
       int rightProduct = 1;

       for(int i=0;i<nums.length;i++){
        rightProduct = i < nums.length - 1 ? res[i + 1] : 1;
        res[i] = leftProduct * rightProduct;
        leftProduct *= nums[i]; 
       }

       return res;
    }
}