class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= s.length()-10; i++){
            String sequence = s.substring(i, i + 10);
            map.put(sequence, map.getOrDefault(sequence, 0) + 1);
            if (map.get(sequence) == 2)
            ans.add(sequence);
        }
        return ans;
    }
}
