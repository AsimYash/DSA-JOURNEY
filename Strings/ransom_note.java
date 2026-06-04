class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] fr = new int [26];
        int [] fm = new int [26];
        for (int i = 0; i<ransomNote.length(); i++){
            fr[ransomNote.charAt(i)-'a']++;
        }
        for (int i = 0; i<magazine.length(); i++){
            fm[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i<26; i++){
            if (fr[i]!=0){
                boolean check = fm[i]>=fr[i];
                if (check == false)
                return false;
            }
        }
        return true;
    }
}
