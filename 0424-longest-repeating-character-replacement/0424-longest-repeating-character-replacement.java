class Solution {
    public int characterReplacement(String s, int k) {
         int[] arr = new int[26];
         int j = 0;
         int maxFreq = 0;
         int maxLength = 0;

         for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'A'] += 1;
            maxFreq = Math.max(maxFreq, arr[s.charAt(i) - 'A']);

            int window = i - j + 1;

            if(window - maxFreq > k){
                arr[s.charAt(j) - 'A'] -= 1;
                j++;
            }
            maxLength = Math.max(maxLength, i - j + 1);
         }
         return maxLength;
    }
}