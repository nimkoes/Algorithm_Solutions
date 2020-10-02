package com.nimkoes.algo.level_2;

public class _018_a_fine_square {
    
    
    public long solution(int w, int h) {
        long temp, gcd = w, n = h, n1, n2;
        
        while (n != 0) {
            temp = gcd % n;
            gcd = n;
            n = temp;
        }
    
        temp = (long) w * h;
        n1 = w / gcd;
        n2 = h / gcd;
    
        return temp - ((n1 + n2 - 1) * gcd);
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _018_a_fine_square_TEST_ENV {
            private int w;
            private int h;
            
            private long expectedResult;
    
            public _018_a_fine_square_TEST_ENV(int w, int h, long expectedResult) {
                this.w = w;
                this.h = h;
                this.expectedResult = expectedResult;
            }
    
            public int getW() {
                return w;
            }
    
            public int getH() {
                return h;
            }
    
            public long getExpectedResult() {
                return expectedResult;
            }
    
            @Override
            public String toString() {
                return "{" +
                        "w=" + w +
                        ", h=" + h +
                        '}';
            }
        }
    
        _018_a_fine_square_TEST_ENV[] env = new _018_a_fine_square_TEST_ENV[1];
        env[0] = new _018_a_fine_square_TEST_ENV(8, 12, 80);

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _018_a_fine_square simulate = new _018_a_fine_square();
        int test_case_no = 1;
        for (_018_a_fine_square_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            long result = simulate.solution(tc.getW(), tc.getH());
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