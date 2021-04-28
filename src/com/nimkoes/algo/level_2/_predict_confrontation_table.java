package com.nimkoes.algo.level_2;

public class _predict_confrontation_table {
    
    public int solution(int n, int a, int b) {
        int answer = 1;
        while((a = getParentIndex(a)) != (b = getParentIndex(b))) ++ answer;
        return answer;
    }
    
    private int getParentIndex(int n) {
        if (n % 2 == 0) return n / 2;
        else return (n / 2) + 1;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _021_predict_confrontation_table_TEST_ENV {
            private int n;
            private int a;
            private int b;
            
            private int expectedResult;
    
            public _021_predict_confrontation_table_TEST_ENV(int n, int a, int b, int expectedResult) {
                this.n = n;
                this.a = a;
                this.b = b;
                this.expectedResult = expectedResult;
            }
    
            public int getN() {
                return n;
            }
    
            public int getA() {
                return a;
            }
    
            public int getB() {
                return b;
            }
    
            public int getExpectedResult() {
                return expectedResult;
            }
    
            @Override
            public String toString() {
                return "{" +
                        "n=" + n +
                        ", a=" + a +
                        ", b=" + b +
                        '}';
            }
        }
    
        _021_predict_confrontation_table_TEST_ENV[] env = new _021_predict_confrontation_table_TEST_ENV[1];
        env[0] = new _021_predict_confrontation_table_TEST_ENV(8, 4, 7, 3);

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _predict_confrontation_table simulate = new _predict_confrontation_table();
        int test_case_no = 1;
        for (_021_predict_confrontation_table_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            int result = simulate.solution(tc.getN(), tc.getA(), tc.getB());
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