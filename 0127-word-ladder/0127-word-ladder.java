class Solution {
    public int ladderLength(String startWord, String targetWord, List<String> wordList) {
        Queue<Pair<String,Integer>> q=new LinkedList<>();
        q.add(new Pair<>(startWord,1));

        Set<String> st = new HashSet<>(wordList);
        st.remove(startWord);

        while(!q.isEmpty()){
            Pair<String, Integer> node = q.poll();
            String word = node.getKey();
            int steps = node.getValue();

            if(word.equals(targetWord)) return steps;

            for(int i=0;i<word.length();i++){
                char[] wordChars = word.toCharArray();
                char orginialChars = wordChars[i];

                for(char ch='a'; ch<='z';ch++){
                    wordChars[i]=ch;
                    String newWord = new String(wordChars);

                    if(st.contains(newWord)){
                        st.remove(newWord);
                        q.add(new Pair<>(newWord, steps+1));
                    }
                }
                wordChars[i]=orginialChars;
                
            }
            
        }
        return 0;
    }
    
}