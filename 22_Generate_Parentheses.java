class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        helper(res, "", 0, 0, n);
        return res;
    }
    
    private void helper( List<String> res, String cur, int open, int close, int max) {
        if (cur.length() == max*2) {
            res.add(cur);
        }
        
        if (open < max) {
            helper(res, cur+"(", open+1, close, max);
        }
        if (open > close) {
            helper(res, cur+")", open, close+1, max);
        }
    }
}

