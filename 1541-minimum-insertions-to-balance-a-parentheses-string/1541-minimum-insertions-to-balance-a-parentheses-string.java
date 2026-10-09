class Solution {
    public int minInsertions(String s) {
        int count = 0;
        int res = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count % 2 == 1){
                    count--;
                    res++;
                }
                count += 2;
            }
            else{
                count--;
                if(count == -1){
                    res++;
                    count = 1;
                }
            }
        }
        res += count;
        return res;
    }
}