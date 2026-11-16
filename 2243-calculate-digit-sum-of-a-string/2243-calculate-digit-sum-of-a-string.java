class Solution {
    public String digitSum(String s, int k) {
        int sum = 0;
        int maxSum = 0;
        int size = 0;
        while(s.length() > k){
        String str = "";
        for(int i=0;i<s.length();i++){
            int n = Character.getNumericValue(s.charAt(i));
            sum += n;
            size++;
            if(size == k || i==s.length()-1){
                str += sum;
                sum = 0;
                size = 0;
            }
        }
        s = str;
      }
      return s;
    }
}