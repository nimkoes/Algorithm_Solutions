package com.nimkoes.algo.level_3;

public class _001_2Xn_tiling {
    int[] memory;
    public int solution(int n) {
        memory = new int[n];
        return calc(n);
    }
    
    private int calc(int n) {
        if(n < 4) return n;
        if(memory[n-1] != 0) return memory[n-1];
        return memory[n-1] = (calc(n-1) + calc(n-2)) % 1000000007;
    }
    
    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _001_2Xn_tiling_TEST_ENV {
            private int n;
            
            private int expectedResult;
    
            public _001_2Xn_tiling_TEST_ENV(int n, int expectedResult) {
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
    
        _001_2Xn_tiling_TEST_ENV[] env = new _001_2Xn_tiling_TEST_ENV[1];
        env[0] = new _001_2Xn_tiling_TEST_ENV(4, 5);

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _001_2Xn_tiling simulate = new _001_2Xn_tiling();
        int test_case_no = 1;
        for (_001_2Xn_tiling_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.nanoTime();
            int result = simulate.solution(tc.getN());
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