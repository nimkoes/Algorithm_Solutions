package com.tistory.xxxelppa.level1;

import java.util.HashMap;

public class _a_player_who_could_not_finish {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        
        // participant 배열의 값을 key로 하여, 각 key 가 몇 번 나왔는지 저장
        for (String str : participant) hm.put(str, hm.getOrDefault(str, 0) + 1);
        // completion 배열의 값을 key로 검색하여, 해당 값을 1 감소
        for (String str : completion) hm.put(str, hm.get(str) - 1);
        
        // hm 의 값이 0인 경우, 해당 이름의 참가자는 완주 했음을 뜻하고
        // 0이 아닌 경우 (0보다 큰 경우) 완주하지 못한 참가자임을 뜻함
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
                break;
            }
        }
        
        return answer;
    }
    
}
