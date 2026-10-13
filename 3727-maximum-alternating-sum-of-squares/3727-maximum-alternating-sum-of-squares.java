class Solution {
    public long maxAlternatingSum(int[] squareArr) {
        //long[] squareArr = new long[nums.length];

        for(int i=0;i<squareArr.length;i++){
            squareArr[i] = squareArr[i] * squareArr[i]; 
        }
        Arrays.sort(squareArr);

        long sum = 0;
        int min =  0, max = squareArr.length / 2;

        while(min < squareArr.length / 2 && max < squareArr.length){
            sum += squareArr[max];
            sum -= squareArr[min];
            min++;
            max++;
        }
        
        if(squareArr.length % 2 != 0) sum += squareArr[max];

        return sum;
    }
}