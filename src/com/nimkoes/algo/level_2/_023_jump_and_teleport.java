package com.nimkoes.algo.level_2;

public class _023_jump_and_teleport {
    
    public int solution(int n) {
        int ans = 0;
        while (n > 0) {
            if(n % 2 != 0) {
                n -= 1;
                ++ans;
            }
            n /= 2;
        }
        return ans;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _023_jump_and_teleport_TEST_ENV {
            private int n;
            
            private int expectedResult;
    
            public _023_jump_and_teleport_TEST_ENV(int n, int expectedResult) {
                this.n = n;
                this.expectedResult = expectedResult;
            }
    
            public int getN() {
                return n;
            }
    
            public int getExpectedResult() {
                return expectedResult;
            }
    
            @Override
            public String toString() {
                return "{" +
                        "n=" + n +
                        '}';
            }
        }
    
        _023_jump_and_teleport_TEST_ENV[] env = new _023_jump_and_teleport_TEST_ENV[3];
        env[0] = new _023_jump_and_teleport_TEST_ENV(5, 2);
        env[1] = new _023_jump_and_teleport_TEST_ENV(6, 2);
        env[2] = new _023_jump_and_teleport_TEST_ENV(5000, 5);

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _023_jump_and_teleport simulate = new _023_jump_and_teleport();
        int test_case_no = 1;
        for (_023_jump_and_teleport_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            int result = simulate.solution(tc.getN());
            long endTime = System.currentTimeMillis();

            System.out.println(" >>> MY RESULT :: " + result);
            if(tc.getExpectedResult() != result) System.out.println(" >>> TEST FAILED !!!!!");
            else System.out.println(" >>> TEST SUCCESS !!!!!");

            System.out.println(" *** EXECUTE TIME :: " + (endTime - startTime) + " (ms)");
            System.out.println("===========================================================");
            System.out.println();
        }
    }
}