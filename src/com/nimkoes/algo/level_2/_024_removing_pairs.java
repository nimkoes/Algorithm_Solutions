package com.nimkoes.algo.level_2;

import java.util.Stack;

public class _024_removing_pairs {
    
    public int solution(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            if (st.size() == 0 || st.peek() != s.charAt(i)) st.push(s.charAt(i));
            else st.pop();
        }
        return st.size() > 0 ? 0 : 1;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _024_removing_pairs_TEST_ENV {
            private String s;
            
            private int expectedResult;
    
            public _024_removing_pairs_TEST_ENV(String s, int expectedResult) {
                this.s = s;
                this.expectedResult = expectedResult;
            }
    
            public String getS() {
                return s;
            }
    
            public int getExpectedResult() {
                return expectedResult;
            }
    
            @Override
            public String toString() {
                return "{" +
                        "s='" + s + '\'' +
                        '}';
            }
        }
    
        _024_removing_pairs_TEST_ENV[] env = new _024_removing_pairs_TEST_ENV[2];
        env[0] = new _024_removing_pairs_TEST_ENV("baabaa", 1);
        env[1] = new _024_removing_pairs_TEST_ENV("cdcd", 0);

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _024_removing_pairs simulate = new _024_removing_pairs();
        int test_case_no = 1;
        for (_024_removing_pairs_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.nanoTime();
            int result = simulate.solution(tc.getS());
            long endTime = System.nanoTime();

            System.out.println(" >>> MY RESULT :: " + result);
            if(tc.getExpectedResult() != result) System.out.println(" >>> TEST FAILED !!!!!");
            else System.out.println(" >>> TEST SUCCESS !!!!!");
            
            System.out.println(" *** EXECUTE TIME :: " + (endTime - startTime) + " (ns)");
            System.out.println("===========================================================");
            System.out.println();
        }
    }
}