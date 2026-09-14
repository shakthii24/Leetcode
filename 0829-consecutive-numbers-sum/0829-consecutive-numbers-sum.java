class Solution {
    public int consecutiveNumbersSum(int n) {
       int k = 1;
       int count = 0;
       int x = n - (k*(k-1))/2;
       while(x > 0){
        if(x % k == 0){
            count++;
        }
         k++;
         x = n - (k*(k-1))/2;
       }
       return count;
    }
}