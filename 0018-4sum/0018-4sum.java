class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        var res = new ArrayList<List<Integer>>();

        for(int i=0;i<nums.length-3;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j + 1;
                int right = nums.length-1;
                while(k < right){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[right];
                    if(sum < target){
                        k++;
                        while(k < right && nums[k] == nums[k-1]) k++;
                    }else if(sum > target){
                        right--;
                        while(right > k && nums[right+1] == nums[right]) right--;
                    }else{
                        res.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k],nums[right])));
                        k++;
                        right--;
                        while(k < right && nums[k] == nums[k-1]) k++;
                        while(right > k && nums[right] == nums[right+1]) right--;
                    }
                }
            }
        }
        return res;
    }
}