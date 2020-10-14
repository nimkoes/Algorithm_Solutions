package com.nimkoes.algo.monthly_code_challenge.day02;

public class _001_reverse_ternary_scale {
    
    public int solution(int n) {
        int answer = 0;
        String t = make3(n);
        for (int i = t.length()-1, j = 1; i >= 0; --i, j *= 3) answer += (((int)t.charAt(i) - 48) * j);
        return answer;
    }
    
    public String make3(int n) {
        StringBuilder sb = new StringBuilder();
        int x = -1, y;
        while(x != 0) {
            x = n / 3;
            y = n % 3;
            n = x;
            sb.append(y);
        }
        return sb.toString();
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _001_reverse_ternary_scale_TEST_ENV {
            private int n;
            
            private int expectedResult;
    
            public _001_reverse_ternary_scale_TEST_ENV(int n, int expectedResult) {
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
    
        _001_reverse_ternary_scale_TEST_ENV[] env = new _001_reverse_ternary_scale_TEST_ENV[2];
        env[0] = new _001_reverse_ternary_scale_TEST_ENV(45, 7);
        env[1] = new _001_reverse_ternary_scale_TEST_ENV(125, 229);

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _001_reverse_ternary_scale simulate = new _001_reverse_ternary_scale();
        int test_case_no = 1;
        for (_001_reverse_ternary_scale_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
//            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
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