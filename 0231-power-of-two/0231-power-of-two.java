class Solution {
    public boolean isPowerOfTwo(int n) {
       while(n > 0){
        if(n == 1) return true;
        else if(n < 0) return false;
        else if(n%2 != 0) return false;
        n /= 2;
       }
       return n <= 0 ? false : true;
    }
}