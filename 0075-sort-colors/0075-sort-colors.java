class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length-1;

        while(mid <= right){
            if(nums[mid] == 1){
                mid++;
            }else if(nums[mid] == 0){
               swap(nums, left, mid);
                left++; mid++;
            }else{
                swap(nums, mid, right); right--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}