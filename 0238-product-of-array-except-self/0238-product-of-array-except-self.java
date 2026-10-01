class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] res = new int[nums.length];

       int leftProduct = 1;
       for(int i=0;i<nums.length;i++){
        res[i] = leftProduct;
        leftProduct *= nums[i];
       }

       int rightProduct = 1;
       int right = nums.length - 1;
       while(right >= 0){
        res[right] = res[right] * rightProduct;
        rightProduct *= nums[right];
        right--;
       }
       return res;
    }
}