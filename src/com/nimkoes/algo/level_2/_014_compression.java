package com.nimkoes.algo.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _014_compression {
    
    public int[] solution(String msg) {
        int[] answer = {};
        HashMap<String, Integer> dictionary = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        int lastIndex = 1;
        
        for (int i = 'A'; i <= 'Z'; ++i) {
            dictionary.put("" + (char)i, i - 64);
            lastIndex++;
        }
    
    
        for (int i = 0; i < msg.length(); ++i) {
            int size = i + 1;
            String temp = "";
            while(size <= msg.length() && dictionary.containsKey((temp = msg.substring(i, size)))) ++size;
            if(!dictionary.containsKey(temp)) dictionary.put(temp, lastIndex++);
            list.add(dictionary.get(temp = msg.substring(i, size-1)));
            if(temp.length() > 1) i += temp.length()-1;
        }
    
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; ++i) answer[i] = list.get(i);
        
        return answer;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _014_compression_TEST_ENV {
            private String msg;
            
            private int[] expectedResult;
    
            public _014_compression_TEST_ENV(String msg, int[] expectedResult) {
                this.msg = msg;
                this.expectedResult = expectedResult;
            }
    
            public String getMsg() {
                return msg;
            }
    
            public String getExpectedResult() {
                return Arrays.toString(expectedResult);
            }
        }
    
        _014_compression_TEST_ENV[] env = new _014_compression_TEST_ENV[4];
        env[0] = new _014_compression_TEST_ENV("KAKAO"                   , new int[] {11, 1, 27, 15});
        env[1] = new _014_compression_TEST_ENV("TOBEORNOTTOBEORTOBEORNOT", new int[] {20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34});
        env[2] = new _014_compression_TEST_ENV("ABABABABABABABAB"        , new int[] {1, 2, 27, 29, 28, 31, 30});
        env[3] = new _014_compression_TEST_ENV("THATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITIS"
                , new int[] {20, 8, 1, 20, 27, 29, 9, 19, 33, 31, 30, 28, 20, 33, 14, 15, 39, 19, 41, 43, 36, 9, 39, 46, 38, 47, 34, 19, 36, 52, 45, 40, 42, 35, 38, 48, 62, 54, 51, 61, 53, 55, 66, 57, 44, 59, 64, 32, 49, 60, 29, 52, 76, 37, 32, 71, 43, 70, 47, 75, 73, 80, 43, 79, 56, 72, 84, 61, 86, 68, 81, 90, 69, 92, 72, 85, 63, 96, 89, 87, 91, 83, 101, 94, 103, 65, 97, 106, 99, 108, 50, 74, 111, 77, 66, 98, 81, 70, 93, 118, 117, 88, 33, 122, 116, 58, 127, 62, 127, 78, 114, 123, 100, 133, 95, 112, 105, 104, 132, 145, 87, 134, 130, 129, 137, 131, 82, 79, 148, 151, 150, 144, 153, 159, 102, 135, 121, 156, 159, 125, 75, 162, 113, 158, 124, 109, 126, 149, 67, 142, 146, 166, 155, 158, 174, 171, 140, 119, 128, 175, 120, 138, 152, 161, 174, 181, 139, 154, 141, 187, 143, 176, 165, 172, 167, 191, 164, 182, 194, 184, 136, 170, 193, 147, 86});

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _014_compression simulate = new _014_compression();
        int test_case_no = 1;
        for (_014_compression_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            
            int[] result = simulate.solution(tc.getMsg());
            long endTime = System.currentTimeMillis();

            System.out.println(" >>> MY RESULT :: " + Arrays.toString(result));
            if(!Arrays.toString(result).equals(tc.getExpectedResult())) System.out.println(" >>> TEST FAILED !!!!!");
            else System.out.println(" >>> TEST SUCCESS !!!!!");

            System.out.println(" *** EXECUTE TIME :: " + (endTime - startTime) + " (ms)");
            System.out.println("===========================================================");
            System.out.println();
        }
    }
}
