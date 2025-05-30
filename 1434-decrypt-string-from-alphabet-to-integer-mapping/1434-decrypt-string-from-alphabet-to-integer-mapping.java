class Solution {
    public String freqAlphabets(String s) {
        HashMap<String,Character> map = new HashMap<>();
        int k=1;
        for(char ch='a';ch<='z';ch++){
            if(ch<='i'){
                map.put(String.valueOf(k++),ch);
            }
            else{
                map.put(String.valueOf(k++)+"#",ch);
            }
        }
        StringBuilder st = new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)=='#'){
                st.append(map.get(s.substring(i-2,i+1)));
                i=i-3;
            }
            else{
                st.append(map.get(s.substring(i,i+1)));
                i=i-1;
            }
        }
        return st.reverse().toString();
    }
}