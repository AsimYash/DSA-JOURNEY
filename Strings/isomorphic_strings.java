class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length())
        return false;
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i<s.length(); i++){
            char x = s.charAt(i);
            char y = t.charAt(i);
            if (map.containsKey(x)){
                if (map.get(x)!=y)
                return false;
            }
            else{
                if (set.contains(y))
                return false;
                map.put(x,y);
                set.add(y);
            }
        }
        return true;
    }
}
