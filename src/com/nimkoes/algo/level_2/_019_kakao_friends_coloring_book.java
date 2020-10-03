package com.nimkoes.algo.level_2;

import java.util.Arrays;

public class _019_kakao_friends_coloring_book {
    
    
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
    
        long[][] pic = new long[m][n];
        for (int i = 0; i < m; ++i) for (int j = 0; j < n; ++j) pic[i][j] = picture[i][j];
        
        for(int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if(pic[i][j] != 0L) {
                    ++numberOfArea;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, check(i, j, m, n, pic[i][j], pic));
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public int check(int x, int y, int m, int n, long ckVal, long[][] pic) {
        if(x < 0 || y < 0 || x >= m || y >= n) return 0;
        if(pic[x][y] == 0L) return 0;
        if(pic[x][y] != ckVal) return 0;
        
        pic[x][y] = 0L;
    
        return 1 + check(x - 1, y, m, n, ckVal, pic)
                + check(x + 1, y, m, n, ckVal, pic)
                + check(x, y + 1, m, n, ckVal, pic)
                + check(x, y - 1, m, n, ckVal, pic);
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _019_kakao_friends_coloring_book_TEST_ENV {
            private int m;
            private int n;
            private int[][] picture;
            
            private int[] expectedResult;
    
            public _019_kakao_friends_coloring_book_TEST_ENV(int m, int n, int[][] picture, int[] expectedResult) {
                this.m = m;
                this.n = n;
                this.picture = picture;
                this.expectedResult = expectedResult;
            }
    
            public int getM() {
                return m;
            }
    
            public int getN() {
                return n;
            }
    
            public int[][] getPicture() {
                return picture;
            }
    
            public String getExpectedResult() {
                return Arrays.toString(expectedResult);
            }
    
            @Override
            public String toString() {
                return "{" +
                        "m=" + m +
                        ", n=" + n +
                        ", picture=" + Arrays.deepToString(picture) +
                        '}';
            }
        }
    
        _019_kakao_friends_coloring_book_TEST_ENV[] env = new _019_kakao_friends_coloring_book_TEST_ENV[1];
        env[0] = new _019_kakao_friends_coloring_book_TEST_ENV(
                6, 4
                , new int[][] {
                    {1, 1, 1, 0},
                    {1, 2, 2, 0},
                    {1, 0, 0, 1},
                    {0, 0, 0, 1},
                    {0, 0, 0, 3},
                    {0, 0, 0, 3}
                }
                , new int[] {4, 5}
        );
        

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _019_kakao_friends_coloring_book simulate = new _019_kakao_friends_coloring_book();
        int test_case_no = 1;
        for (_019_kakao_friends_coloring_book_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            int[] result = simulate.solution(tc.getM(), tc.getN(), tc.getPicture());
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