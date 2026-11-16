class Solution {
    public String digitSum(String s, int k) {
        String str = "";
        int sum = 0;
        int maxSum = 0;
        int size = 0;
        while(s.length() > k){
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
        str = "";
      }
      return s;
    }
}