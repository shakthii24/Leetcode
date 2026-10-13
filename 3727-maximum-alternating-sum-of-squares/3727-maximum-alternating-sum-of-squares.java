class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] squareArr = new long[nums.length];

        for(int i=0;i<nums.length;i++){
            squareArr[i] = nums[i] * nums[i]; 
        }
        Arrays.sort(squareArr);

        long sum = 0;
        int min =  0, max = nums.length / 2;

        while(min < nums.length / 2 && max < nums.length){
            sum += squareArr[max];
            sum -= squareArr[min];
            min++;
            max++;
        }
        
        if(nums.length % 2 != 0) sum += squareArr[max];

        return sum;
    }
}