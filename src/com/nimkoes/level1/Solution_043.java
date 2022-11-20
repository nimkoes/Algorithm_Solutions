package com.nimkoes.level1;

public class Solution_043 {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        // 왼손과 오른손의 기본 위치
        int lPos = 10;
        int rPos = 12;
        
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                // 1, 4, 7 은 왼손 사용
                sb.append("L");
                // 마지막 왼손 위치 기록
                lPos = number;
            } else if (number == 3 || number == 6 || number == 9) {
                // 3, 6, 9 오른손 사용
                sb.append("R");
                // 마지막 오른손 위치 기록
                rPos = number;
            } else { // 2 5 8 0
                int lDist = getDist(lPos, number);
                int rDist = getDist(rPos, number);
                
                // 더 가까운 위치의 손을 사용
                if (lDist > rDist) {
                    sb.append("R");
                    rPos = number;
                } else if (lDist < rDist) {
                    sb.append("L");
                    lPos = number;
                } else {
                    // 위치가 같으면 어느손 잡이인지에 따라 사용하는 손이 다름
                    if (hand.equals("right")) {
                        sb.append("R");
                        rPos = number;
                    } else {
                        sb.append("L");
                        lPos = number;
                    }
                }
            }
        }
        return sb.toString();
    }
    
    public static int getDist(int pos, int target) {
        // 2, 5, 8, 0 인데 계산하기 쉽기 위해 0을 11로 대체
        if (target == 0) target = 11;
        if (pos == 0) pos = 11;
        
        int locationX = (pos - 1) / 3;
        int locationY = (pos - 1) % 3;
        
        int numberX = (target - 1) / 3;
        int numberY = (target - 1) % 3;
        
        return Math.abs(locationX - numberX) + Math.abs(locationY - numberY);
    }
}
