class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair<String,Integer>> q = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);
        

        q.add(new Pair<>(beginWord,1));

        while(!q.isEmpty()){
            Pair<String,Integer> node=q.poll();
            String word = node.getKey();
            int steps = node.getValue();
            if(word.equals(endWord)) return steps;

            for(int i=0;i<word.length();i++){
                char[] charArray = word.toCharArray();
                char org = charArray[i];

                for(char ch='a';ch<='z';ch++){
                    charArray[i]=ch;
                    String newWord = new String(charArray);

                    if(set.contains(newWord)){
                        q.add(new Pair<>(newWord, steps+1));
                        set.remove(newWord);
                    }
                }
                charArray[i]=org;
            }
        }
        return 0;
    }
}