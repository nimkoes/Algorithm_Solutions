package com.nimkoes.algo.level_2;

public class _n_system_game {
    char[] num = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
    
        String temp = "0";
        int t_cnt = 0;
        int turn = 1;
        
        for (int dNum = 0; t_cnt < t; ++dNum) {
            for (int j = 0; j < temp.length(); ++j) {
                if(turn == p) {
                    sb.append(temp.charAt(j));
                    if(++t_cnt == t) return sb.toString();
                }
                if (turn == m) turn = 1;
                else ++turn;
            }
            temp = getN(dNum, n);
        }
        return sb.toString();
    }
    
    public String getN(int i, int n) {
        StringBuilder sb = new StringBuilder();
        while (i != 0) {
            sb.append(num[i % n]);
            i = i / n;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _014_compression_TEST_ENV {
            private int n;
            private int t;
            private int m;
            private int p;
            
            private String expectedResult;
    
            public _014_compression_TEST_ENV(int n, int t, int m, int p, String expectedResult) {
                this.n = n;
                this.t = t;
                this.m = m;
                this.p = p;
                this.expectedResult = expectedResult;
            }
    
            public int getN() {
                return n;
            }
    
            public int getT() {
                return t;
            }
    
            public int getM() {
                return m;
            }
    
            public int getP() {
                return p;
            }
    
            public String getExpectedResult() {
                return expectedResult;
            }
    
            @Override
            public String toString() {
                return "{" +
                        "n=" + n +
                        ", t=" + t +
                        ", m=" + m +
                        ", p=" + p +
                        '}';
            }
        }
    
        _014_compression_TEST_ENV[] env = new _014_compression_TEST_ENV[3];
        env[0] = new _014_compression_TEST_ENV(2, 4, 2, 1, "0111");
        env[1] = new _014_compression_TEST_ENV(16, 16, 2, 1, "02468ACE11111111");
        env[2] = new _014_compression_TEST_ENV(16, 16, 2, 2, "13579BDF01234567");

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _n_system_game simulate = new _n_system_game();
        int test_case_no = 1;
        for (_014_compression_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            
            String result = simulate.solution(tc.getN(), tc.getT(), tc.getM(), tc.getP());
            long endTime = System.currentTimeMillis();

            System.out.println(" >>> MY RESULT :: " + result);
            if(!tc.getExpectedResult().equals(result)) System.out.println(" >>> TEST FAILED !!!!!");
            else System.out.println(" >>> TEST SUCCESS !!!!!");

            System.out.println(" *** EXECUTE TIME :: " + (endTime - startTime) + " (ms)");
            System.out.println("===========================================================");
            System.out.println();
        }
    }
}
