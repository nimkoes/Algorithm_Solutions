package com.nimkoes.weekly_challenge;

public class Week_002 {
    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        int len = scores.length;
        long max, min, sum;
        
        for (int i = 0; i < len; ++i) {
            max = -1;
            min = 101;
            sum = 0;
            
            for (int j = 0; j < len; ++j) {
                if (i == j) continue;
                max = Math.max(max, scores[j][i]);
                min = Math.min(min, scores[j][i]);
                sum += scores[j][i];
            }
            
            if (scores[i][i] > max || scores[i][i] < min) {
                answer.append(getScore(sum / (len - 1)));
            } else {
                sum += scores[i][i];
                answer.append(getScore(sum / len));
            }
        }
        
        return answer.toString();
    }
    
    private String getScore(double avg) {
        return avg >= 90 ? "A" : avg >= 80 ? "B" : avg >= 70 ? "C" : avg >= 50 ? "D" : "F";
    }
}
