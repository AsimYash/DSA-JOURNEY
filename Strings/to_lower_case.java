class Solution {
    public String toLowerCase(String s) {
        //return s.toLowerCase();
        StringBuilder lcase = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i)>='A' && s.charAt(i)<='Z')
            lcase.append((char)(s.charAt(i)+32));
            else
            lcase.append(s.charAt(i));
        }
        return lcase.toString();
    }
}
