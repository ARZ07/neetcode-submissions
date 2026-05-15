class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(m!=n){
            return false;
        }
        Map<Character, Integer> mp1 = new HashMap<>();
        for(int i=0;i<n;i++){
            mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<n;i++){
            char c = t.charAt(i);
            if(!mp1.containsKey(c)){
                return false;
            }
            int count = mp1.get(c)-1;
            if(count==0){
                mp1.remove(c);
            }else{
                mp1.put(c, count);
            }
        }
            return mp1.isEmpty();
    }
}
