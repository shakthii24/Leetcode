class Solution {
    public int scoreOfParentheses(String s) {
      int count = 0;
      int max = 0;
      int i = 0;
      for(char ch : s.toCharArray()){
        if(ch == '('){
            count++;
        }
        else{
            count--;
            if(s.charAt(i - 1) == '('){
                max += Math.pow(2,count);
            }
        }
        i++;
      }
      return max;
    }
}