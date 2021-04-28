package com.nimkoes.algo.level_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _pokemon {
    
    public int solution(int[] nums) {
        int max = nums.length/2;
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (!set.contains(num) && set.size() < max) set.add(num);
        }
        return set.size();
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _025_pokemon_TEST_ENV {
            private int[] nums;
            
            private int expectedResult;
    
            public _025_pokemon_TEST_ENV(int[] nums, int expectedResult) {
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
    
        _025_pokemon_TEST_ENV[] env = new _025_pokemon_TEST_ENV[3];
        env[0] = new _025_pokemon_TEST_ENV(new int[] {3, 1, 2, 3}, 2);
        env[1] = new _025_pokemon_TEST_ENV(new int[] {3, 3, 3, 2, 2, 4}, 3);
        env[2] = new _025_pokemon_TEST_ENV(new int[] {3, 3, 3, 2, 2, 2}, 2);

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _pokemon simulate = new _pokemon();
        int test_case_no = 1;
        for (_025_pokemon_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.nanoTime();
            int result = simulate.solution(tc.getNums());
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