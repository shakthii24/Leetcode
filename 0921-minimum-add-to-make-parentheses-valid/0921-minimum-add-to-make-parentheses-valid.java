class Solution {
    public int minAddToMakeValid(String s) {
        int res = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
            }else{
                if(count == 0){
                    res++;
                }else{
                    count--;
                }
            }
        }
        res += count;
        
        return res;
    }
}