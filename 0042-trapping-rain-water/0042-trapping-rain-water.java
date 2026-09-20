class Solution {
    public int trap(int[] height) {
        int k = 0, l = height.length - 1;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int lMax = -1, rMax = -1;
        while(k < height.length){
            lMax = Math.max(lMax, height[k]);
            leftMax[k] = lMax;
            rMax = Math.max(rMax, height[l]);
            rightMax[l] = rMax;
            k++; l--;
        }
        
        int waterCount = 0;
        for(int i=0;i<height.length;i++){
            waterCount += Math.min(leftMax[i],rightMax[i]) - height[i];
        }

        return waterCount;
    }
}