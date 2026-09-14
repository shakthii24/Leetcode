class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        int[] arr = new int[n];

        for (int i = 3; i < n; i += 2) {
            arr[i] = 1;
        }

        for (int i = 3; i <= n / i; i += 2) {
            if (arr[i] == 1) {
                for (int j = i * i; j < n; j += 2 * i) {
                    arr[j] = 0;
                }
            }
        }

        int count = 1; 

        for (int i = 3; i < n; i += 2) {
            if (arr[i] == 1) {
                count++;
            }
        }

        return count;
    }
}