class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (strs == null || len ==0) {
            return "";
        }
        String res = strs[0];
        for (int i=1;i<len;i++) {
            while (strs[i].indexOf(res)!=0){
                res = res.substring(0,res.length()-1);
            }
        }
       return res; 
    }
}

