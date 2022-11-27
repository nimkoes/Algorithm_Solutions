package com.nimkoes.programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class Solution_026 {
    public int solution(int n, int[] lost, int[] reserve) {
        // 전체 학생 수에서 체육복은 도난 당한 학생 수를 계산
        int answer = n - lost.length;

        // 도난 또는 여벌을 가진 학생이 중복되는 경우가 없으므로 (문제 전제)
        // Set 계열 자료구조 사용
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        // 도난당한 학생 Set 구성
        for (int elem : lost) lostSet.add(elem);

        // 여벌이 있는 학생을 순회
        for (int elem : reserve) {
            // 여벌이 있는데 도난 당했을 경우
            if (lostSet.contains(elem)) {
                // answer 에 불필요하게 -1 된 상태이므로 answer 값을 1 증가
                ++answer;
                // 도난 당했지만 여벌이 있으므로 도난 목록에서 제거
                lostSet.remove(elem);
            } else {
                // 여벌이 있고, 도난 당하지 않았을 경우
                // 다른 학생에게 빌려줄 수 있음
                reserveSet.add(elem);
            }
        }

        // 빌려줄 수 있는 학생 Set을 순회
        for (int target : reserveSet) {
            if (lostSet.contains(target - 1)) { // 여벌이 있는 학생의 바로 앞번호가 도난 당한 학생인지 확인
                // 수업을 들을 수 있는 학생 수 +1
                ++answer;
                // 체육복이 생겼으므로 도난 당한 학생 목록에서 제거
                lostSet.remove(target - 1);
            } else if (lostSet.contains(target + 1)) { // 여벌이 있는 학생의 바로 뒷번호가 도난 당한 학생인지 확인
                // 수업을 들을 수 있는 학생 수 +1
                ++answer;
                // 체육복이 생겼으므로 도난 당한 학생 목록에서 제거
                lostSet.remove(target + 1);
            }
        }

        return answer;
    }
}
