class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0, max = 0, count = 0;
        for(int i = 0;i<nums.length;i++){
            int n = nums[i];
            if(max< n){
                max = n;
            }
            if(nums[i] == 0){
                count++;
            }
            sum += n;
        }
        if(count == 0){
            return 0;
        }
        int total = max*(max+1)/2;
        int res = total-sum;
        if(res == 0) return max+1;
        return res;
    }
}
