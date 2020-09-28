package com.nimkoes.algo.level_1;

import java.util.ArrayList;
import java.util.List;

public class _005_dart_game {
    
    public int solution(String dartResult) {
        
        class ScorePerShot {
            int score;
    
            public ScorePerShot(String score) {
                this.score = Integer.parseInt(score);
            }
    
            public void SDTType(String type) {
                if (type.equals("D")) score = score * score;
                else if (type.equals("T")) score = score * score * score;
            }
            
            public void oops() {
                score = score * -1;
            }
            
            public void star() {
                score = score * 2;
            }
    
            public int getScore() {
                return score;
            }
        }
        
        int answer;
    
        List<ScorePerShot> list = new ArrayList<>();
        List<String> shots = new ArrayList<>();
        
        int subS, subE;
        for(int i = 0; i < dartResult.length(); ++i) {
            int temp = dartResult.charAt(i);
            if(temp == 83 || temp == 68 || temp == 84) {  // "S" "D" "T"
                subS = i - 1;
                if(dartResult.charAt(i-1) == 48 && i > 1) {
                    if(dartResult.charAt(i-2) == 49) subS = i-2;
                }
    
                subE = i + 1;
                if (i + 1 < dartResult.length()) {
                    if (dartResult.charAt(i + 1) == 42 || dartResult.charAt(i + 1) == 35) {  // "*", "#"
                        subE = i + 2;
                    }
                }
                shots.add(dartResult.substring(subS, subE));
            }
        }
    
        String shot_info;
        int sub_index;
        for (int i = 0; i < shots.size(); ++i) {
            shot_info = shots.get(i);
            if ((sub_index = shot_info.indexOf("S")) <= 0 && (sub_index = shot_info.indexOf("D")) <= 0) {
                sub_index = shot_info.indexOf("T");
            }
    
            list.add(new ScorePerShot(shot_info.substring(0, sub_index)));
            list.get(i).SDTType(shot_info.substring(sub_index, sub_index+1));
            
            if(shot_info.length() - sub_index > 1) {
                if(shot_info.charAt(shot_info.length()-1) == 42) {
                    list.get(i).star();
                    if(i != 0) list.get(i-1).star();
                } else {
                    list.get(i).oops();
                }
            }
        }
    
        answer = list.stream().mapToInt(ScorePerShot::getScore).sum();
        return answer;
    }

    public static void main(String[] ar) {

        /*******************************
         * SET TEST CASE START
         *******************************/
        class _005_dart_game_TEST_ENV {
            private String dartResult;
            
            private int expectedResult;
    
            public _005_dart_game_TEST_ENV(String dartResult, int expectedResult) {
                this.dartResult = dartResult;
                this.expectedResult = expectedResult;
            }
    
            public String getDartResult() {
                return dartResult;
            }
    
            public int getExpectedResult() {
                return expectedResult;
            }
    
            @Override
            public String toString() {
                return "{" +
                        "dartResult='" + dartResult + '\'' +
                        ", expectedResult=" + expectedResult +
                        '}';
            }
        }
    
        _005_dart_game_TEST_ENV[] env = new _005_dart_game_TEST_ENV[7];
        env[0] = new _005_dart_game_TEST_ENV("1S2D*3T" , 37);
        env[1] = new _005_dart_game_TEST_ENV("1D2S#10S", 9);
        env[2] = new _005_dart_game_TEST_ENV("1D2S0T"  , 3);
        env[3] = new _005_dart_game_TEST_ENV("1S*2T*3S", 23);
        env[4] = new _005_dart_game_TEST_ENV("1D#2S*3S", 5);
        env[5] = new _005_dart_game_TEST_ENV("1T2D3D#" , -4);
        env[6] = new _005_dart_game_TEST_ENV("1D2S3T*" , 59);

        /*******************************
         * SET TEST CASE END
         *******************************/


        /*******************************
         * EXEC TEST
         *******************************/
        _005_dart_game simulate = new _005_dart_game();
        int test_case_no = 1;
        for (_005_dart_game_TEST_ENV tc : env) {
            System.out.println("===========================================================");
            System.out.println(" >>> TEST NO " + test_case_no++);
            System.out.println(" >>> INPUT :: " + tc.toString());
            System.out.println(" >>> EXPECTED RESULT :: " + tc.getExpectedResult());
            System.out.println();

            long startTime = System.currentTimeMillis();
            int result = simulate.solution(tc.getDartResult());
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
