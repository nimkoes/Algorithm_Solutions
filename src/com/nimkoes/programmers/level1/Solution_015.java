package com.nimkoes.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution_015 {
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
        int dartResultSize = dartResult.length();
        for (int i = 0; i < dartResultSize; ++i) {
            int temp = dartResult.charAt(i);
            if (temp == 'S' || temp == 'D' || temp == 'T') {
                subS = i - 1;
                if (dartResult.charAt(i - 1) == '0' && i > 1) {
                    if (dartResult.charAt(i - 2) == '1') subS = i - 2;
                }
                
                subE = i + 1;
                if (i + 1 < dartResult.length()) {
                    if (dartResult.charAt(i + 1) == '*' || dartResult.charAt(i + 1) == '#') {
                        subE = i + 2;
                    }
                }
                shots.add(dartResult.substring(subS, subE));
            }
        }
        
        String shot_info;
        int sub_index;
        int shotSize = shots.size();
        for (int i = 0; i < shotSize; ++i) {
            shot_info = shots.get(i);
            if ((sub_index = shot_info.indexOf("S")) <= 0 && (sub_index = shot_info.indexOf("D")) <= 0) {
                sub_index = shot_info.indexOf("T");
            }
            
            list.add(new ScorePerShot(shot_info.substring(0, sub_index)));
            list.get(i).SDTType(shot_info.substring(sub_index, sub_index + 1));
            
            if (shot_info.length() - sub_index > 1) {
                if (shot_info.charAt(shot_info.length() - 1) == '*') {
                    list.get(i).star();
                    if (i != 0) list.get(i - 1).star();
                } else {
                    list.get(i).oops();
                }
            }
        }
        
        answer = list.stream().mapToInt(ScorePerShot::getScore).sum();
        return answer;
    }
}
