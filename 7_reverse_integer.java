class Solution {
    public int reverse(int x) {
        try {
        String numString = Integer.toString(x);
        String reversedNumString;
        StringBuilder sb;
        if (numString.length() > 1 && numString.charAt(0) == '-') {
             sb = new StringBuilder(numString.substring(1,numString.length()));
             reversedNumString = "-" + sb.reverse().toString();
        }
        else {
             sb = new StringBuilder(numString);
             reversedNumString = sb.reverse().toString();
        }
        return Integer.parseInt(reversedNumString);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }
}

