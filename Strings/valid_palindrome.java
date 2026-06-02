class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        int n = s.length();
        for (int i = 0; i<n; i++){
            if (Character.isLetterOrDigit(s.charAt(i)))
            str = str+s.charAt(i);
        }
        str = str.toLowerCase();
        String st = str, rst = "";
        int m = st.length()-1;
        while(m>=0){
            rst = rst+st.charAt(m);
            m--;
        }
        if (rst.equals(st))
        return true;
        else
        return false;
    }
}
