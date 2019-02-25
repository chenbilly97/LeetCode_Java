class Solution {
    public String decodeString(String s) {
        Stack<String> resStack = new Stack<String>();
        Stack<Integer> countStack = new Stack<Integer>();
        int start = 0, count =0;
        String res = "";
        int len = s.length();
        while (start<len)
        {
            char c = s.charAt(start);
            if (Character.isDigit(c))
            {
                // calculate count
                count = c - '0';
                while (Character.isDigit(s.charAt(start+1)))
                {
                    count = count*10 + (s.charAt(start+1) - '0');
                    start++;
                }
                countStack.push(count);
            }
            else if (c == '[')
            {
                //push to stack
                resStack.push(res);
                res = "";

            }
            else if (c == ']')
            {
                // pop from stack
                count = countStack.pop();
                StringBuilder sb = new StringBuilder(resStack.pop());
                for (int i=0;i<count;i++)
                {
                    sb.append(res);
                }
                res = sb.toString();
            }
            else
            {
                res += Character.toString(c);
            }
            start++;
        }
        return res;
    }
}