class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int prefixProduct = 1;
            for(int j=i;j<nums.length;j++){
                prefixProduct *= nums[j];
                maxProduct = Math.max(maxProduct, prefixProduct);
            }
        }
        return maxProduct;
    }
}