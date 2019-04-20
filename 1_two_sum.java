class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap();
        for (int i=0;i<len;i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
 }