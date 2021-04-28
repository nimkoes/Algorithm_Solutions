package com.nimkoes.algo.level_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _english_word_chain {
    
    public int[] solution(int n, String[] words) {
        int[] answer = new int[] {0, 0};
        
        char beforeTail, afterHead;
        Set<String> set = new HashSet<>();
    
        set.add(words[0]);
        beforeTail = words[0].charAt(words[0].length()-1);
        
        for (int i = 1; i < words.length; ++i) {
            afterHead = words[i].charAt(0);
            if (beforeTail != afterHead || set.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            set.add(words[i]);
            beforeTail = words[i].charAt(words[i].length()-1);
        }
    
        return answer;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _020_english_word_chain_TEST_ENV {
            private int n;
            private String[] words;
            
            private int[] expectedResult;
    
            public _020_english_word_chain_TEST_ENV(int n, String[] words, int[] expectedResult) {
                this.n = n;
                this.words = words;
                this.expectedResult = expectedResult;
            }
    
            public int getN() {
                return n;
            }
    
            public String[] getWords() {
                return words;
            }
    
            public String getExpectedResult() {
                return Arrays.toString(expectedResult);
            }
    
            @Override
            public String toString() {
                return "{" +
                        "n=" + n +
                        ", words=" + Arrays.toString(words) +
                        '}';
            }
        }
    
        _020_english_word_chain_TEST_ENV[] env = new _020_english_word_chain_TEST_ENV[3];
        env[0] = new _020_english_word_chain_TEST_ENV(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}, new int[] {3, 3});
        env[0] = new _020_english_word_chain_TEST_ENV(3, new String[] {"tank", "kick",  "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}, new int[] {3, 3});
        env[1] = new _020_english_word_chain_TEST_ENV(5, new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}, new int[] {0, 0});
        env[2] = new _020_english_word_chain_TEST_ENV(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"}, new int[] {1, 3});

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _english_word_chain simulate = new _english_word_chain();
        int test_case_no = 1;
        for (_020_english_word_chain_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            int[] result = simulate.solution(tc.getN(), tc.getWords());
            long endTime = System.currentTimeMillis();

            System.out.println(" >>> MY RESULT :: " + Arrays.toString(result));
            if(!tc.getExpectedResult().equals(Arrays.toString(result))) System.out.println(" >>> TEST FAILED !!!!!");
            else System.out.println(" >>> TEST SUCCESS !!!!!");

            System.out.println(" *** EXECUTE TIME :: " + (endTime - startTime) + " (ms)");
            System.out.println("===========================================================");
            System.out.println();
        }
    }
}