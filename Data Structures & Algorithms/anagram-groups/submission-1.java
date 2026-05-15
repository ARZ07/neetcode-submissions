class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String s:strs){
            int[] freq = new int[26];

            for(char c:s.toCharArray()){
                freq[c-'a']++;
            }

            StringBuilder key = new StringBuilder();
            for(int count:freq){
                key.append('#').append(count);
            }
            mp.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
