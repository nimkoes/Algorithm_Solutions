package com.nimkoes.algo.level_2;

import java.util.*;

public class _026_tuple {
    
    public int[] solution(String s) {
        int[] answer = {};
        
        String[] temp = s.substring(2, s.length()-2).split("},\\{");
        String[][] str = new String[temp.length][];
        
        HashMap<Integer, LinkedList<String>> hm = new HashMap<>();
        Set<String> set = new HashSet<>();
        LinkedList<String> ll;
        
        for (int i = 0; i < temp.length; ++i) {
            str[i] = temp[i].split(",");
            ll = new LinkedList<>();
    
            Collections.addAll(ll, str[i]);
            hm.put(ll.size(), ll);
        }
        
        answer = new int[hm.size()];
        
        String already;
        for (int i = 0; i < hm.size(); ++i) {
            LinkedList<String> strings = hm.get(i + 1);
            for (String string : strings) {
                if (!set.contains(string)) {
                    answer[i] = Integer.parseInt(string);
                    set.add(string);
                }
            }
        }
        
        return answer;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _026_tuple_TEST_ENV {
            private String s;
            
            private int[] expectedResult;
    
            public _026_tuple_TEST_ENV(String s, int[] expectedResult) {
                this.s = s;
                this.expectedResult = expectedResult;
            }
    
            public String getS() {
                return s;
            }
    
            public String getExpectedResult() {
                return Arrays.toString(expectedResult);
            }
    
            @Override
            public String toString() {
                return "{" +
                        "s='" + s + '\'' +
                        '}';
            }
        }
    
        _026_tuple_TEST_ENV[] env = new _026_tuple_TEST_ENV[5];
        env[0] = new _026_tuple_TEST_ENV("{{2},{2,1},{2,1,3},{2,1,3,4}}", new int[] {2, 1, 3, 4});
        env[1] = new _026_tuple_TEST_ENV("{{1,2,3},{2,1},{1,2,4,3},{2}}", new int[] {2, 1, 3, 4});
        env[2] = new _026_tuple_TEST_ENV("{{20,111},{111}}", new int[] {111, 20});
        env[3] = new _026_tuple_TEST_ENV("{{123}}", new int[] {123});
        env[4] = new _026_tuple_TEST_ENV("{{4,2,3},{3},{2,3,4,1},{2,3}}", new int[] {3, 2, 4, 1});

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _026_tuple simulate = new _026_tuple();
        int test_case_no = 1;
        for (_026_tuple_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.nanoTime();
            int[] result = simulate.solution(tc.getS());
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