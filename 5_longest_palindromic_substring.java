class Solution {
    String result = "";
    public String longestPalindrome(String s) {
        int len = s.length();
        for (int i=0;i<len;i++)
        {
            helper(i,i,s);
            helper(i,i+1,s);
        }
     return result;
    }
    
    private void helper(int i, int j, String s)
    {
        int len = s.length();
        while (i>=0 && j<len && s.charAt(i) == s.charAt(j)) 
        {
           if (result.length() < j - i + 1)
          {
            result = s.substring(i,j+1);
          }
           i--;
           j++;
        }
        
    }
}

