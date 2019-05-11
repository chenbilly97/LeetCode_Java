class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();;
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for (int i=0;i<len;i++) {
            if (i>0 && nums[i]==nums[i-1]) continue;
            int l = i+1, r = len-1;
            while (l < r) {
                if (nums[i]+nums[l]+nums[r]==0) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    result.add(list);
                    while ( l<r && nums[l]==nums[l+1]) l++;
                    while ( l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }
                else if (nums[i]+nums[l]+nums[r] < 0) {
                   l++; 
                }
                else {
                   r--;
                }
            }
        }
        return result;
    }
}

