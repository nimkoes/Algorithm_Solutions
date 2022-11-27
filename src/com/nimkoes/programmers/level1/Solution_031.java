package com.nimkoes.programmers.level1;

import java.util.Arrays;

public class Solution_031 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int i = 0;
        for (int[] com : commands) {
            answer[i++] = Arrays.stream(array)  // 스트림 생성
                    .skip(com[0] - 1)                     // 시작 위치
                    .limit(com[1] - (com[0] - 1))         // 마지막 위치
                    .sorted()                           // 시작 ~ 마지막 사이의 값을 정렬
                    .skip(com[2] - 1)                     // 시작 위치로부터 com[2] 번째에 위치한 값까지 skip
                    .findFirst()                        // 현재 가장 앞에 위치한 값
                    .getAsInt();                        // Optional 클래스에서 값 가져오기
        }
        
        return answer;
    }
}
