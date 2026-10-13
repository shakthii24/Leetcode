class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] squareArr = new long[nums.length];

        for(int i=0;i<nums.length;i++){
            squareArr[i] = nums[i] * nums[i]; 
        }
        Arrays.sort(squareArr);

        long[] resArr = new long[nums.length];
        int j = 0, k = 1;
        int m = 0;

        while(k < nums.length){
            resArr[k] = squareArr[m];
            k += 2;
            m++;
        }

        while(j < nums.length){
            resArr[j] = squareArr[m];
            j += 2;
            m++;
        }

        System.out.println(Arrays.toString(squareArr));

        long sum = 0;
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                sum += resArr[i];
            }else{
                sum -= resArr[i];
            }
        }
        return sum;
    }
}