class Solution {
    public int reverse(int x) {
        long n = x;

        long rev = 0;

        while(n != 0){
            long digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        if(rev <= Integer.MAX_VALUE && rev >= Integer.MIN_VALUE) return (int) rev;
        return 0;
    }
}