class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int distance = Integer.MAX_VALUE , sum = 0, res = 0;
        if (nums == null || nums.length == 0 ) {
            return res;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for (int i=0;i<len;i++) {
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i+1, r = len-1;
            while (l<r) {
                sum = nums[i]+nums[l]+nums[r];
                if (distance > Math.abs(sum - target)) {
                    distance = Math.abs(sum - target);
                    res = sum;
                }
                
                if (sum < target) {
                    l++;
                }
                else if (sum > target) {
                    r--;
                }
                else {
                    return res;
                }
            }
        }
        return res;
    }
}

