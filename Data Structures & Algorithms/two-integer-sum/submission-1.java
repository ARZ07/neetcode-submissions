class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int [] res = new int[2];
        Map <Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int t = target-nums[i];
            if(mp.containsKey(t)){
                res[0] = mp.get(t);
                res[1] = i;
                break;
            }
            mp.put(nums[i], i);
        }
        return res;
    }
}
