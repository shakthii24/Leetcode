class Solution {
    public String removeOuterParentheses(String s) {
       int count = 0;
       String res = "";
       StringBuilder sb = new StringBuilder();

       for(char ch : s.toCharArray()){
        if(ch == '('){
            if(count >= 1) sb.append(ch);
            count++;
        }else{
            count--;
            if(count >= 1){
                sb.append(ch);
            }
        }
       }
       return sb.toString();
    }
}