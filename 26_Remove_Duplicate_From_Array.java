class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
          return 0;
        }
        int i = 0, len = nums.length;
        for(int j=1;j<len;j++) {
          if (nums[i] != nums[j]) {
            i++;
            nums[i] = nums[j];
          }
        }
        return i+1;
    }
}
