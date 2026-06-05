class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ipadd = new StringBuilder();
        for (int i = 0; i<address.length(); i++){
            if (address.charAt(i)!='.')
            ipadd.append(address.charAt(i));
            else
            ipadd.append("[.]");
        }
        return ipadd.toString();
    }
}
