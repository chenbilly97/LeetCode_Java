class Solution {
    Map<String,String> dic = new HashMap<String,String>() {{
            put("2","abc");
            put("3","def");
            put("4","ghi");
            put("5","jkl");
            put("6","mno");
            put("7","pqrs");
            put("8","tuv");
            put("9","wxyz");
        }};
    
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
           return res;
        }
        helper("",digits,res);
        return res;
    }
    
    private void helper(String combination, String digits, List<String> resList) {
        if (digits == null || digits.length()==0) {
            resList.add(combination);
            return; 
        }
        
        String letters = dic.get(digits.substring(0,1));
        int len = letters.length();
        for (int i=0;i<len;i++) {
            String letter = letters.substring(i,i+1);
            helper(combination+letter,digits.substring(1),resList);
        }
    }
}

