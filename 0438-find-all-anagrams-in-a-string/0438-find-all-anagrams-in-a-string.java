class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int[] resArr = new int[26];
       for(char c : p.toCharArray()) resArr[c - 'a']+=1;
       var list = new ArrayList<Integer>();
       int[] currentArr = new int[26];
       for(int i=0;i<s.length();i++){
        currentArr[s.charAt(i) - 'a']+=1;
        if(i >= p.length()) currentArr[s.charAt(i-p.length()) - 'a']-=1;

        if(Arrays.equals(currentArr, resArr)){
            list.add(i-p.length()+1);
        }
       }
       return list;
    }
}