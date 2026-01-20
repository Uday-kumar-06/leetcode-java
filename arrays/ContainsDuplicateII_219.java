class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // int i = 0;
        // int j = 1;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i]) <= k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
