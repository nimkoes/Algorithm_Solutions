package com.nimkoes.algo.level_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class _cache {

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if(cacheSize == 0) return 5 * cities.length;

        Queue<String> queue = new LinkedList<>();
        HashMap<String, Integer> hm = new HashMap<>();

        String current = "";
        for(int i = 0; i < cities.length; ++i) {
            current = cities[i].toLowerCase();
            if(queue.remove(current)) {
                ++answer;
            } else {
                answer += 5;
                if(queue.size() >= cacheSize) queue.poll();
            }
            queue.add(current);
        }
        return answer;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _012_cache_TEST_ENV {
            private int cacheSize;
            private String[] cities;
            private int expectedResult;

            public _012_cache_TEST_ENV(int cacheSize, String[] cities, int expectedResult) {
                this.cacheSize = cacheSize;
                this.cities = cities;
                this.expectedResult = expectedResult;
            }

            public int getCacheSize() {
                return cacheSize;
            }

            public String[] getCities() {
                return cities;
            }

            public int getExpectedResult() {
                return expectedResult;
            }

            @Override
            public String toString() {
                return "{" +
                        "cacheSize=" + cacheSize +
                        ", cities=" + Arrays.toString(cities) +
                        '}';
            }
        }

        _012_cache_TEST_ENV[] env = new _012_cache_TEST_ENV[6];
        env[0] = new _012_cache_TEST_ENV(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}, 50);
        env[1] = new _012_cache_TEST_ENV(3, new String[] {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}, 21);
        env[2] = new _012_cache_TEST_ENV(2, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}, 60);
        env[3] = new _012_cache_TEST_ENV(5, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}, 52);
        env[4] = new _012_cache_TEST_ENV(2, new String[] {"Jeju", "Pangyo", "NewYork", "newyork"}, 16);
        env[5] = new _012_cache_TEST_ENV(0, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}, 25);

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _cache simulate = new _cache();
        int test_case_no = 1;
        for (_012_cache_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            int result = simulate.solution(tc.getCacheSize(), tc.getCities());
            long endTime = System.currentTimeMillis();

            System.out.println(" >>> MY RESULT :: " + result);
            if(result != tc.getExpectedResult()) System.out.println(" >>> TEST FAILED !!!!!");
            else System.out.println(" >>> TEST SUCCESS !!!!!");


            System.out.println(" *** EXECUTE TIME :: " + (endTime - startTime) + " (ms)");
            System.out.println("===========================================================");
            System.out.println();
        }
    }
}
