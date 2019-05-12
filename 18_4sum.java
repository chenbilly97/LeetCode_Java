class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = nums.length;
        if (nums== null || len == 0) {
            return res;
        }
        Arrays.sort(nums);
        for (int i=0;i<len;i++) {
            if (i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            for (int j=i+1;j<len;j++) {
                if (j>i+1 && nums[j]==nums[j-1]) {
                    continue;
                }
                int l = j+1, r = len-1;
                while (l<r) {
                    if (nums[i]+nums[j]+nums[l]+nums[r]==target) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        res.add(list);
                        while (l<r && nums[l]==nums[l+1]) l++;
                        while (l<r && nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                    } 
                    else if (nums[i]+nums[j]+nums[l]+nums[r]<target) {
                        l++;
                    }
                    else {
                        r--;
                    }
                }
            }
        }
        return res;
    }
}

