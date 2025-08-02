class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair<String, Integer>> q = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);
        q.add(new Pair<>(beginWord,1));

        while(!q.isEmpty()){
            Pair<String, Integer> node = q.poll();
            String word = node.getKey();
            int steps = node.getValue();

            if(word.equals(endWord)) return steps;

            for(int i=0;i<word.length();i++){
                char[] wordArray = word.toCharArray();
                char org = wordArray[i];

                for(char ch='a';ch<='z';ch++){
                    wordArray[i]=ch;
                    String newWord = new String(wordArray);
                    if(set.contains(newWord)){
                        set.remove(newWord);
                        q.add(new Pair<>(newWord, steps+1));
                    }
                }

                wordArray[i]=org;
            }
        }
        return 0;
    }
}