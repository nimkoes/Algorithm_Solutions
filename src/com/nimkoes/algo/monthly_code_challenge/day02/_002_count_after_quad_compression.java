package com.nimkoes.algo.monthly_code_challenge.day02;

import java.util.Arrays;

public class _002_count_after_quad_compression {
    int[] answer;
    public int[] solution(int[][] arr) {
        answer = new int[2];
        check(arr, 0, 0, arr.length);
        return answer;
    }
    
    public void check(int[][] arr, int x, int y, int size) {
        if(size == 1) {
            ++answer[arr[x][y]];
            return;
        }
        int target = arr[x][y];
        boolean result = true;
        for (int i = x; i < x + size; ++i) {
            for (int j = y; j < y + size; ++j) {
                if(target != arr[i][j]) {
                    result = false;
                    break;
                }
            }
        }
        
        if (result) {
            ++ answer[target];
        } else {
            int sub = size >> 1;
            check(arr, x, y, sub);
            check(arr, x + sub, y, sub);
            check(arr, x, y + sub, sub);
            check(arr, x + sub, y + sub, sub);
        }
    }
    

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _002_count_after_quad_compression_TEST_ENV {
            private int[][] arr;
            
            private int[] expectedResult;
    
            public _002_count_after_quad_compression_TEST_ENV(int[][] arr, int[] expectedResult) {
                this.arr = arr;
                this.expectedResult = expectedResult;
            }
    
            public int[][] getArr() {
                return arr;
            }
    
            public String getExpectedResult() {
                return Arrays.toString(expectedResult);
            }
    
            @Override
            public String toString() {
                return "{" +
                        "arr=" + Arrays.deepToString(arr) +
                        '}';
            }
        }
    
        _002_count_after_quad_compression_TEST_ENV[] env = new _002_count_after_quad_compression_TEST_ENV[2];
        env[0] = new _002_count_after_quad_compression_TEST_ENV(new int[][] {
                {1, 1, 0, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 1},
                {1, 1, 1, 1}
                }, new int[] {4, 9});
        
        env[1] = new _002_count_after_quad_compression_TEST_ENV(new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1, 1, 1},
                {0, 1, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 1, 1, 1, 1}
                }, new int[]{10, 15});

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _002_count_after_quad_compression simulate = new _002_count_after_quad_compression();
        int test_case_no = 1;
        for (_002_count_after_quad_compression_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.nanoTime();
            int[] result = simulate.solution(tc.getArr());
            long endTime = System.nanoTime();

            System.out.println(" >>> MY RESULT :: " + Arrays.toString(result));
            if(!tc.getExpectedResult().equals(Arrays.toString(result))) System.out.println(" >>> TEST FAILED !!!!!");
            else System.out.println(" >>> TEST SUCCESS !!!!!");
            
            System.out.println(" *** EXECUTE TIME :: " + (endTime - startTime) + " (ns)");
            System.out.println("===========================================================");
            System.out.println();
        }
    }
}