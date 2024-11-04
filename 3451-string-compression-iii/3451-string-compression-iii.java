class Solution {
    public String compressedString(String word) {
        int c=1;
        int l=word.length();
        StringBuilder ch=new StringBuilder();

        for(int i=0;i<l-1;i++){
            if(word.charAt(i)==word.charAt(i+1) && c<9){
                c++;
            }
            else
            {
                ch.append(c).append(word.charAt(i));
                c=1;
            }
        } 
        ch.append(c).append(word.charAt(l-1));
        return ch.toString();
        
    }
}