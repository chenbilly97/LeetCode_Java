class Solution {
    public int myAtoi(String str) {
        int len = str.length();
        int index = 0;
        int sign = 1;
        StringBuilder sb = new StringBuilder();
        while (index < len && str.charAt(index) == ' ') {
            index++;
        }
        if (index >= len) 
            return 0;
        
        if (str.charAt(index) == '+') {
            sign = 1;
            index++;
        } 
        else if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        else if (str.charAt(index) - '0' < 0 || str.charAt(index) - '0' > 9 ) {
            return 0;
        }
        
        while (index < len ) {
             if ((str.charAt(index) - '0'<0) || (str.charAt(index) - '0' > 9))
                break;
            sb.append(str.charAt(index++));
        }
        
        int result;
        if (sb.toString().equals("")) return 0;
        try {
        result = Integer.parseInt(sb.toString());
        
        } catch (NumberFormatException ex) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return sign * result;
    }
}

