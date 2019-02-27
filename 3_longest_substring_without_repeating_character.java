class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0;
        HashSet<Character> set = new HashSet<Character>();
        int maxLen = 0;
        int len = s.length();
        while (end < len)
        {
            char element = s.charAt(end);
            if (!set.contains(element))
            {
                set.add(element);
                end++;
                maxLen = Math.max(maxLen , end - start);
            }
            else {
                set.remove(s.charAt(start));
                start++;
            }
            
        }
        return maxLen;
    }
}
