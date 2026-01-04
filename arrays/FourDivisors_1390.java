class Solution {
    public static int divisorSum(int n){
        int count = 0;
        int sum = 0;
        int finalSum = 0;
        for(int i = 1;i<=n;i++){
            if(n%i == 0){
                count++;
                sum += i;
            }
            if(count > 4){
                return 0;
            }
        }
        if(count == 4){
            finalSum = sum;
        }
        return finalSum;
    }
    public int sumFourDivisors(int[] nums) {
        int result = 0;
        for(int i = 0;i<nums.length;i++){
            result += divisorSum(nums[i]);
        }
        return result;
    }
}