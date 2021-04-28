package com.nimkoes.algo.level_2;

import java.util.Arrays;

public class _make_prime_number {
    
    public int solution(int[] nums) {
        int answer = 0;
        int num_len = nums.length;
    
        for (int i = 0; i < num_len - 2; ++i) {
            for (int j = i + 1; j < num_len - 1; ++j) {
                for (int k = j + 1; k < num_len; ++k) {
                    int checkNum = nums[i] + nums[j] + nums[k];
                    if(isPrime(checkNum)) ++ answer;
                }
            }
        }
        return answer;
    }
    
    public boolean isPrime(int num) {
        if(num % 2 == 0) return false;
        for (int i = 3; i < num; ++i) if(num % i == 0) return false;
        return true;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _022_make_prime_number_TEST_ENV {
            private int[] nums;
            
            private int expectedResult;
    
            public _022_make_prime_number_TEST_ENV(int[] nums, int expectedResult) {
                this.nums = nums;
                this.expectedResult = expectedResult;
            }
    
            public int[] getNums() {
                return nums;
            }
    
            public int getExpectedResult() {
                return expectedResult;
            }
    
            @Override
            public String toString() {
                return "{" +
                        "nums=" + Arrays.toString(nums) +
                        '}';
            }
        }
    
        _022_make_prime_number_TEST_ENV[] env = new _022_make_prime_number_TEST_ENV[2];
        env[0] = new _022_make_prime_number_TEST_ENV(new int[] {1, 2, 3, 4}, 1);
        env[1] = new _022_make_prime_number_TEST_ENV(new int[] {1, 2, 7, 6, 4}, 4);

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _make_prime_number simulate = new _make_prime_number();
        int test_case_no = 1;
        for (_022_make_prime_number_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            int result = simulate.solution(tc.getNums());
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