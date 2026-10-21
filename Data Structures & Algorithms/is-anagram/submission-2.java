class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch : t.toCharArray()) {
            if(map.containsKey(ch)) {
                int count = map.get(ch)-1;
                if(count==0) {
                    map.remove(ch);
                } else {
                    map.put(ch, count);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
