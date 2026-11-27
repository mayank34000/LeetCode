class Solution {
    static void solve(int n , int open , int close , StringBuilder output , List<String> ans){
        if(output.length()==2*n){
            ans.add(output.toString());
            return;
        }
        if(open<n){
            output.append('(');
            solve(n , open+1 , close , output , ans);
            output.deleteCharAt(output.length()-1);
        }
        if(close<open){
            output.append(')');
            solve(n , open , close+1 , output , ans);
            output.deleteCharAt(output.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        int open=0;
        int close=0;
        StringBuilder output=new StringBuilder();
        List<String> ans=new ArrayList<>();
        solve(n,open,close,output,ans);
        return ans;
    }
}