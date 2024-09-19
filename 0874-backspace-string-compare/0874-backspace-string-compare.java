class Solution {
    public boolean backspaceCompare(String s, String t) {
        s=func(s,s.length());
        t=func(t,t.length());
        return s.equals(t);
        

    }
    public String func(String s,int n)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)== '#')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        
        return st.toString();
    }

}