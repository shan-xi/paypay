import java.util.*;

public class Solution1 {
    int solution(String beginWord, String endWord, String[] wordList) {

        if (Objects.equals(beginWord, endWord))
            return 0;

        Set<String> set = new HashSet<>(Arrays.asList(wordList));
        if (!set.contains(endWord))
            return 0;

        int level = 0;
        int wordlength = beginWord.length();
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                char[] word = queue.peek().toCharArray();
                queue.remove();

                for (int pos = 0; pos < wordlength; pos++) {
                    char origChar = word[pos];
                    for (char c = 'a'; c <= 'z'; c++) {
                        word[pos] = c;
                        if (String.valueOf(word).equals(endWord))
                            return level + 1;
                        
                        if(set.contains(String.valueOf(word))){
                            set.remove(String.valueOf(word));
                            queue.add(String.valueOf(word));
                        }
                    }
                    word[pos] = origChar;
                }
            }
        }

        return 0;
    }


    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String beginWord = "hit";
        String endWord = "cog";
        String[] wordList = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(s.solution(beginWord, endWord, wordList));
        String beginWord1 = "a";
        String endWord1 = "c";
        String[] wordList1 = {"a", "b", "c"};
        System.out.println(s.solution(beginWord1, endWord1, wordList1));
        String beginWord2 = "hit";
        String endWord2 = "cog";
        String[] wordList2 = {"hot", "lot", "dot", "dog", "log", "cog"};
        System.out.println(s.solution(beginWord2, endWord2, wordList2));
        String beginWord3 = "hit";
        String endWord3 = "cog";
        String[] wordList3 = {"hot", "dot", "dog", "lot", "log"};
        System.out.println(s.solution(beginWord3, endWord3, wordList3));
        String beginWord4 = "hit";
        String endWord4 = "cog";
        String[] wordList4 = {"hot", "cog", "dog", "tot", "hog", "hop", "pot", "dot"};
        System.out.println(s.solution(beginWord4, endWord4, wordList4));
    }
}
