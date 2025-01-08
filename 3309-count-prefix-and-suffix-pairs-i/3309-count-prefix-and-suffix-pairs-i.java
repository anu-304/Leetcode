class Solution {
    boolean func(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2){
            return false;
        }
        return s2.substring(0,n1).equals(s1)  && s2.substring(n2-n1).equals(s1);
    }
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        int n=words.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(func(words[i],words[j])){
                    c++;
                }
            }
        }
        return c;
        
    }
}