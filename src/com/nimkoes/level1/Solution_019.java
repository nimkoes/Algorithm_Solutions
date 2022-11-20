package com.nimkoes.level1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;
import java.util.TreeMap;

public class Solution_019 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failure_rate = new double[N];
        
        // 스테이지 별 머물러 있는 사람 수를 담는 Map.
        HashMap<Integer, Integer> hm = new HashMap<>();
        TreeMap<Double, Stack<Integer>> tm = new TreeMap<>(Collections.reverseOrder());
        
        // 스테이지 번호는 key 로, 그 스테이지에 머물러 있는 플레이어 수를 value 로 Map 에 저장한다.
        for (int i : stages) hm.put(i, hm.getOrDefault(i, 0) + 1);
        
        // hm Map 의 key 가 N+1 이라는 것은, 마지막 스테이지까지 모두 클리어 한 플레이어임을 뜻한다.
        // 최초 모든 스테이지를 클리어한 플레이어의 수를 가져온다.
        // 이 변수는 해당 스테이지에 도달한 플레이어의 수의 누적 합을 저장한다.
        // 누적 합을 계산하는 이유는, 클리어 한 플레이어도 도달한 플레이어로 계산하기 때문이다.
        int number_of_players_reaching_the_stage = hm.getOrDefault(N + 1, 0);
        
        // 마지막 스테이지부터 낮은 스테이지로 반복문 실행한다.
        for (int i = N; i > 0; --i) {
            // N 번 스테이지에 머물러있는 사람의 수를 가져온다.
            // 머물러 있다는 것은, 도달했으나 클리어하지 못한 것을 뜻한다.
            int number_of_players_who_did_not_clear_the_stage = hm.getOrDefault(i, 0);
            
            // i 번째 스테이지를 클리어하지 못하고 머물러있는 플레이어가 있는 경우, 스테이지에 도달한 사람의 수를 추가한다.
            if (number_of_players_who_did_not_clear_the_stage != 0)
                number_of_players_reaching_the_stage += number_of_players_who_did_not_clear_the_stage;
            
            // i 번째 스테이지에 도달 또는 클리어한 플레이어가 없으면,
            // i 번째 스테이지, 즉 배열의 i-1 번째 실패율을 0.0 으로 계산한다.
            // 그렇지 않은 경우 i 번째 스테이지에 머물러있는 사람을, 도달 또는 클리어한 사람의 수로 나누어 실패율을 계산한다.
            failure_rate[i - 1] = number_of_players_reaching_the_stage == 0 ? 0.0
                    : (double) number_of_players_who_did_not_clear_the_stage / number_of_players_reaching_the_stage;
            
            // 문제에서는 계산된 '실패율'을 내림차순으로 정렬해야 하기 때문에
            // '실패율' 값을 key 로 가지는, value 가 stack 인 자료구조에 스테이지 정보를 push 한다.
            // stack 에 push 하는 이유는, 동일한 실패율을 가지는 경우 낮은 번호의 스테이지를 먼저 출력하기 위함이다.
            // 현재 반복문을 내림차순으로 실행하고 있음으로, stack 에 마지막에 들어갔을 수록 스테이지 번호가 낮다는 것을 뜻한다.
            // 즉, 먼저 출력 되어야 한다.
            if (!tm.containsKey(failure_rate[i - 1])) tm.put(failure_rate[i - 1], new Stack<>());
            tm.get(failure_rate[i - 1]).push(i);
        }
        
        // tm 에서 하나씩 값을 꺼내면서 더이상 값이 없을 때까지 반복한다.
        int index = 0;
        while (tm.size() > 0) {
            // tm 은 이미 key 값 기준으로 내림차순 정렬 된 상태를 유지하도록 (TreeMap 의 reverse order)
            // 정의했기 때문에 tm 의 최상위 요소는 항상 실패율이 가장 높은 스테이지 번호를 stack 에 담고 있다.
            Stack<Integer> value = tm.pollFirstEntry().getValue();
            
            // 현재 꺼내온 실패율에서 스테이지가 큰 번호가 아래로 쌓인 stack 데이터를 가져왔으므로
            // 하나씩 pop 을 하면 같은 실패율에 대해 스테이지 번호가 오름차순으로 나오게 되어있다.
            while (value.size() > 0) answer[index++] = value.pop();
        }
        return answer;
    }
}
