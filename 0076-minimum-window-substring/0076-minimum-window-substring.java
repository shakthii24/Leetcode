class Solution {
    public String minWindow(String s, String t) {
        int right = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int[] tArray = new int[128];
        int[] sArray = new int[128];
        for(char ch : t.toCharArray()) tArray[ch]++;
        int count = t.length();
        String res = "";

        while(right < s.length()){
            char ch = s.charAt(right);
            sArray[ch]++;
            
            if(tArray[ch] > 0 && sArray[ch] <= tArray[ch]){
                count--;
            }

            while(count == 0){
                int currentLength = right - left + 1;
                if(currentLength < minLength){
                    minLength = currentLength;
                    res = s.substring(left, right+1);
                }
                sArray[s.charAt(left)]--;
                if(tArray[s.charAt(left)] > 0 && sArray[s.charAt(left)] < tArray[s.charAt(left)]){
                    count++;
                }
                left++;
            }
            right++;
        }
        return res;
    }
}