class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        
        
        int temp=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='[' || Character.isLetterOrDigit(ch)){
                st.push(ch);
            }
            else if(ch==']'){
                StringBuilder sb = new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    sb.insert(0,st.pop());
                }
                st.pop();
                StringBuilder num = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num.insert(0,st.pop());
                }
                temp= Integer.parseInt(num.toString());
                String repeat = sb.toString().repeat(temp);
                for(char c:repeat.toCharArray()){
                    st.push(c);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch:st){
            res.append(ch);
        }
        return res.toString();
    }

}