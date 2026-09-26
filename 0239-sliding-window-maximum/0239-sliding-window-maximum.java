class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        var queue = new ArrayDeque<Integer>();
        int[] resultArr = new int[nums.length - k + 1];
        int left = 0, right = 0;

        while(right < k){
            while(!queue.isEmpty() && nums[queue.peekLast()] < nums[right]){
                queue.pollLast();
            }
            queue.offerLast(right);
            right++;
        }
        resultArr[left] = nums[queue.peekFirst()];

        while(right < nums.length){
            if(nums[queue.peekFirst()] == nums[left]){
                queue.pollFirst();
            }
            left++;
            while(!queue.isEmpty() && nums[right] > nums[queue.peekLast()]){
                queue.pollLast();
            }
            queue.offerLast(right);
            resultArr[left] = nums[queue.peekFirst()];
            right++;
        }
        return resultArr;
    }
}