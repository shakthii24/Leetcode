class Solution {
    public int findMaxLength(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i] = nums[i] == 0 ? -1 : 1;

        int prefixSum = 0;
        var map = new HashMap<Integer,Integer>();
        map.put(0, -1);
        int maxLength = 0;

        for(int i=0;i<nums.length;i++){
            prefixSum += arr[i];
            if(map.containsKey(prefixSum)){
                maxLength = Math.max(maxLength, i - map.get(prefixSum));
            }else{
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}