class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int left = 0, right = s.length()-1;
        char[] arr = s.toCharArray();
        while(left < right){
            if(vowels.indexOf(arr[left]) == -1) left++;
            else if(vowels.indexOf(arr[right]) == -1) right--;
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        String res = "";
        for(char ch : arr) res += ch;
        return res;
    }
}