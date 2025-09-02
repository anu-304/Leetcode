class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair<String, Integer>> q = new LinkedList<>();
        HashSet<String> hs = new HashSet<>(wordList);

        q.add(new Pair<>(beginWord, 1));

        while(!q.isEmpty()){
            Pair<String, Integer> node = q.poll();
            String word = node.getKey();
            int steps = node.getValue();
            if(word.equals(endWord)){
                return steps;
            }

            for(int i=0;i<word.length();i++){
                char[] charArr = word.toCharArray();
                char org = charArr[i];

                for(char ch = 'a'; ch<='z';ch++){
                    charArr[i]=ch;
                    String newWord = new String(charArr);
                    if(hs.contains(newWord)){
                        hs.remove(newWord);
                        q.add(new Pair<>(newWord, steps+1));
                    }
                }
                charArr[i]=org;
            }
        }
        return 0;
    }
}