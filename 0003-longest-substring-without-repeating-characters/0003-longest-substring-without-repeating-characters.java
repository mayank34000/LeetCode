class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxlen=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char c=s.charAt(left);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}