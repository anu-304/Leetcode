class Solution {
    public int minInsertions(String s) {
        int open_bracket = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open_bracket++;
            }
            else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    if(open_bracket>0) open_bracket--;
                    else{
                        ans++;
                    }
                    i++;
                }
                else{
                    if(open_bracket>0){
                        open_bracket--;
                        ans++;
                    }
                    else{
                        ans=ans+2;
                    }
                }
            }
        }
        return ans+(2*open_bracket);
    }
}