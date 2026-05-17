class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int d = target- nums[i];
            if(mp.containsKey(d)){
                res[1] = i;
                res[0] = mp.get(d);
            }
            mp.put(nums[i],i);
        }

        return res;
    }
}
