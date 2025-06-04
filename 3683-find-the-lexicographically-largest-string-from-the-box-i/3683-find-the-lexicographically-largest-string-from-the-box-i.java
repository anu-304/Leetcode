class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends==1) return word;
        int n=word.length();
        int l = n - numFriends + 1;
        String res = "";
        for(int i=0;i<n;i++){
            String temp;
            if(i+l<n)
                temp = word.substring(i,i+l);
            else
                temp = word.substring(i);
            if(temp.compareTo(res)>0)
                res = temp;

        }
        return res;
    }
}