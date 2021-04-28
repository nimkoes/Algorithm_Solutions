package com.nimkoes.algo.level_1;

import java.util.Arrays;

public class _secret_map {
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; ++i) {
            String temp = lpad(n, Integer.toBinaryString(arr1[i] | arr2[i]));
            answer[i] = temp.replace("1", "#").replace("0", " ");
        }
        
        return answer;
    }
    
    public String lpad(int len, String str) {
        return "0".repeat(Math.max(0, len - str.length())) + str;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _004_secret_map_TEST_ENV {
            private int n;
            private int[] arr1;
            private int[] arr2;
            
            private String[] expectedResult;
    
            public _004_secret_map_TEST_ENV(int n, int[] arr1, int[] arr2, String[] expectedResult) {
                this.n = n;
                this.arr1 = arr1;
                this.arr2 = arr2;
                this.expectedResult = expectedResult;
            }
    
            public int getN() {
                return n;
            }
    
            public int[] getArr1() {
                return arr1;
            }
    
            public int[] getArr2() {
                return arr2;
            }
    
            public String getExpectedResult() {
                return Arrays.toString(expectedResult);
            }
        }
    
        _004_secret_map_TEST_ENV[] env = new _004_secret_map_TEST_ENV[2];
        env[0] = new _004_secret_map_TEST_ENV(5, new int[] {9, 20, 28, 18, 11}     , new int[] {30, 1, 21, 17, 28}     , new String[] {"#####","# # #", "### #", "#  ##", "#####"});
        env[1] = new _004_secret_map_TEST_ENV(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10}, new String[] {"######", "###  #", "##  ##", " #### ", " #####", "### # "});

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _secret_map simulate = new _secret_map();
        int test_case_no = 1;
        for (_004_secret_map_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            String[] result = simulate.solution(tc.getN(), tc.getArr1(), tc.getArr2());
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
