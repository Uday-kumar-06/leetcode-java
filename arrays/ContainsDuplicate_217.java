class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            set.add(nums[i]);
        }
        if(set.size() == nums.length){
            return false;
        }
        return true;
    }
}
