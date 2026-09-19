class Solution {
    public int lengthOfLongestSubstring(String s) {
        //if(s.length() < 2) return 1;

        int[] arr = new int[256];
        for(int i=0;i<256;i++) arr[i] = -1;

        int i = 0;
        int j = 0;
        int maxLength = 0;

        while(j < s.length()){
            int n = s.charAt(j);
            if(arr[n] != -1){
                if(arr[n] >= i){
                     i = arr[n] + 1;
                }
            }
            int length = j - i + 1;
            maxLength = Math.max(maxLength, length);
            arr[n] = j;
            j++;
        }
        return maxLength;
    }
}