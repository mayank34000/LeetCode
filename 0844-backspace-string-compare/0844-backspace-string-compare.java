class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(ch1=='#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
            else{
                st1.push(ch1);
            }
        }
        StringBuilder ans1=new StringBuilder();
        for(char c: st1){
            ans1.append(c);
        }
        Stack<Character>st2=new Stack<>();
        for(int i=0;i<t.length();i++){
            char ch2=t.charAt(i);
            if(ch2=='#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
            else{
                st2.push(ch2);
            }
        }
        StringBuilder ans2=new StringBuilder();
        for(char a:st2){
            ans2.append(a);
        }
        if(ans1.toString().equals(ans2.toString()))return true;
        else{
            return false;
        }
    }
}