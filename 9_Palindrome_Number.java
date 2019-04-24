class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        else if (x == 0) {
            return true;
        }
        String str = Integer.toString(x).replaceAll(" ","");
        String reversedStr = new StringBuilder(str).reverse().toString();
        return reversedStr.equals(str);
        
    }
}

