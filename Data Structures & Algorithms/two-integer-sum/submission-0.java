class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int [] res = new int[2];
        for(int i=0;i<n-1;i++){
            int t = target-nums[i];
            for(int j=i+1;j<n;j++){
                if(nums[j]==t){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}
