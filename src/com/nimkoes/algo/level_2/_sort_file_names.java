package com.nimkoes.algo.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _sort_file_names {
    
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        
        class HNT implements Comparable<HNT> {
            private String head;
            private String number;
            private String tail;
    
            public HNT(String head, String number, String tail) {
                this.head = head;
                this.number = number;
                this.tail = tail;
            }
    
            @Override
            public int compareTo(HNT o) {
                int result;
                if ((result = this.head.toUpperCase().compareTo(o.head.toUpperCase())) == 0) {
                    result = Integer.parseInt(this.number) - Integer.parseInt(o.number);
                }
                return result;
            }
    
            @Override
            public String toString() {
                return head + number + tail;
            }
        }
        
        List<HNT> list = new ArrayList<>();
        
        for(String str : files) {
            int headIndex = -1;
            int numberIndex = -1;
            
            for (int i = 0; i < str.length(); ++i) {
                if(headIndex == -1 && str.charAt(i) >= '0' && str.charAt(i) <= '9') headIndex = i;
                if(headIndex != -1 && numberIndex == -1 && (str.charAt(i) < '0' || str.charAt(i) > '9')) numberIndex = i;
                if(headIndex != -1 && numberIndex != -1) break;
            }
            
            if(numberIndex == -1) numberIndex = str.length();
            list.add(new HNT(str.substring(0, headIndex), str.substring(headIndex, numberIndex), str.substring(numberIndex)));
        }
    
        Collections.sort(list);
        for (int i = 0; i < list.size(); ++i) answer[i] = list.get(i).toString();
        return answer;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _016_sort_file_names_TEST_ENV {
            private String[] files;
            private String[] expectedResult;
    
            public _016_sort_file_names_TEST_ENV(String[] files, String[] expectedResult) {
                this.files = files;
                this.expectedResult = expectedResult;
            }
    
            public String[] getFiles() {
                return files;
            }
    
            public String getExpectedResult() {
                return Arrays.toString(expectedResult);
            }
    
            @Override
            public String toString() {
                return "{" +
                        "files=" + Arrays.toString(files) +
                        ", expectedResult=" + Arrays.toString(expectedResult) +
                        '}';
            }
        }
    
        _016_sort_file_names_TEST_ENV[] env = new _016_sort_file_names_TEST_ENV[2];
        env[0] = new _016_sort_file_names_TEST_ENV(new String[] {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"}, new String[] {"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"});
        env[1] = new _016_sort_file_names_TEST_ENV(new String[] {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"}, new String[] {"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"});

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _sort_file_names simulate = new _sort_file_names();
        int test_case_no = 1;
        for (_016_sort_file_names_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            String[] result = simulate.solution(tc.getFiles());
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