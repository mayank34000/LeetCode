class Solution {
    public int minChanges(String s) {
        int count=0;
        for(int i=0;i<s.length();i+=2){
            char ch=s.charAt(i);
            if(ch!=s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}