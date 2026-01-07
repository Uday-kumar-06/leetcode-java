class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxWater = 0;
        while(left<right){
            if(height[left]<=height[right]){
                int rs = right-left;
                maxWater = Math.max(maxWater,rs*height[left]);
                left++;
            }else{
                int rn = right-left;
                maxWater = Math.max(maxWater,rn*height[right]);
                right--;
            }
            
        }
        return maxWater;
    }
}