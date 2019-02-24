class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        int len = nums.length;

        for (int num : nums)
        {
            set.add(num);
        }


        for (int i=1;i<=len;i++)
        {
            if (!set.contains(i))
            {
                result.add(i);
            }
        }
        return result;
    }
}