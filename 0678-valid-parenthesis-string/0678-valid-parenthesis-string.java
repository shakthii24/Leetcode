class Solution {
    public boolean checkValidString(String s) {
        int close = 0;
        int open = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                close++; open++;
            }
            else if(ch == ')'){
                close--;
                open--;
                if(open < 0) open = 0;
                if(close < 0) return false;
            }
            else{
                open--;
                if(open < 0) open = 0;
                close++;
            }
        }

        return open == 0;
    }
}