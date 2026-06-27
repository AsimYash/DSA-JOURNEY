class Solution {
    public int compress(char[] chars) {
        int ind = 0;
        int i = 0;
        while (i < chars.length){
            char current = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == current){
                count++;
                i++;
            }
            chars[ind++] = current;
            if (count > 1){
                String s = String.valueOf(count);
                for (char ch : s.toCharArray())
                chars[ind++] = ch;
            }
        }
        return ind;
    }
}
