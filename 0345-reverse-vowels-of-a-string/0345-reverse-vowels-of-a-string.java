class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');
        int left = 0, right = s.length()-1;
        char[] arr = s.toCharArray();
        while(left < right){
            if(!set.contains(arr[left])) left++;
            else if(!set.contains(arr[right])) right--;
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}