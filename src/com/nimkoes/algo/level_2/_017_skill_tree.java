package com.nimkoes.algo.level_2;

import java.util.Arrays;
import java.util.HashMap;

public class _017_skill_tree {
    
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int[] arr;
        boolean b;
        
        HashMap<Character, Integer> hm;
    
        for (String str : skill_trees) {
            hm = new HashMap<>();
            arr = new int[skill.length()];
            b = true;
            
            for (int i = 0; i < str.length(); ++i) hm.put(str.charAt(i), i);
            for (int i = 0; i < skill.length(); ++i) arr[i] = hm.getOrDefault(skill.charAt(i), 99);
            
            for (int i = 0; i < arr.length - 1; ++i) {
                if (arr[i] > arr[i + 1]) {
                    b = false;
                    break;
                }
            }
            
            if(b) ++answer;
        }
        
        return answer;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _017_skill_tree_TEST_ENV {
            private String skill;
            private String[] skill_trees;
            
            private int expectedResult;
    
            public _017_skill_tree_TEST_ENV(String skill, String[] skill_trees, int expectedResult) {
                this.skill = skill;
                this.skill_trees = skill_trees;
                this.expectedResult = expectedResult;
            }
    
            public String getSkill() {
                return skill;
            }
    
            public String[] getSkill_trees() {
                return skill_trees;
            }
    
            public int getExpectedResult() {
                return expectedResult;
            }
    
            @Override
            public String toString() {
                return "{" +
                        "skill='" + skill + '\'' +
                        ", skill_trees=" + Arrays.toString(skill_trees) +
                        '}';
            }
        }
    
        _017_skill_tree_TEST_ENV[] env = new _017_skill_tree_TEST_ENV[1];
        env[0] = new _017_skill_tree_TEST_ENV("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}, 2);

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _017_skill_tree simulate = new _017_skill_tree();
        int test_case_no = 1;
        for (_017_skill_tree_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            int result = simulate.solution(tc.getSkill(), tc.getSkill_trees());
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