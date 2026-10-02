class Solution {
    public boolean isValid(String s) {
        
        var stack = new Stack<Character>();
        for(char c :s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                char ch1 = stack.peek();
                if(ch1 == '(' && c==')' ||
                   ch1 == '[' && c==']' ||
                   ch1 == '{' && c=='}'){
                    stack.pop();
                   }else{
                    stack.push(c);
                   }
            }
        }

        return stack.isEmpty();
    }
}