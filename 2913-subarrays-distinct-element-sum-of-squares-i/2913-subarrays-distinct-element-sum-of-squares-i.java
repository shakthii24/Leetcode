class Solution {
    public int sumCounts(List<Integer> nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                if(!set.contains(nums.get(j))){
                    set.add(nums.get(j));
                    res += set.size() * set.size();
                }else{
                    res += set.size() * set.size();
                }
            }
            set.clear();
        }
        return res;
    }
}