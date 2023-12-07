import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class WordSubsets {
    public static void main(String[] args) {

        String [] words1 = {"amazon","apple","facebook","google","leetcode"};
        String [] words2 = {"e","o"};
        System.out.println(wordSubsets(words1, words2));


    }
    public static List<String> wordSubsets(String[] words1, String[] words2) {
       List<String> list = new ArrayList<>();

       int[] maxFreq = new int[26];

        for (String word2:words2

             ) {
            int[] currentWord = getCharFreq(word2);
            for (int i = 0; i <26 ; i++) {
                maxFreq[i] = Math.max(maxFreq[i], currentWord[i]);
            }
        }

        for (String word1: words1
             ) {
            boolean valid = true;
            int[] current = new int[26];
            current = getCharFreq(word1);

            for (int i = 0; i < 26; i++) {
                if (current[i] < maxFreq[i]){
                    valid = false;
                    break;
                }
            }
            if (valid)list.add(word1);
        }



       return list;
    }

    public static int [] getCharFreq(String string){
        int[] charFreq = new int[26];
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            charFreq[c-'a']++;
        }
      return charFreq;
    }
}
