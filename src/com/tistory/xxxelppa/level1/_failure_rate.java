package com.tistory.xxxelppa.level1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;
import java.util.TreeMap;

public class _failure_rate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failure_rate = new double[N];
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        TreeMap<Double, Stack<Integer>> tm = new TreeMap<>(Collections.reverseOrder());
        
        for (int i : stages) hm.put(i, hm.getOrDefault(i, 0) + 1);
        
        int number_of_players_reaching_the_stage = hm.getOrDefault(N + 1, 0);
        
        for (int i = N; i > 0; --i) {
            int number_of_players_who_did_not_clear_the_stage = hm.getOrDefault(i, 0);
            if (number_of_players_who_did_not_clear_the_stage != 0)
                number_of_players_reaching_the_stage += number_of_players_who_did_not_clear_the_stage;
            
            failure_rate[i - 1] = number_of_players_reaching_the_stage == 0 ? 0.0
                    : (double) number_of_players_who_did_not_clear_the_stage / number_of_players_reaching_the_stage;
            
            if (!tm.containsKey(failure_rate[i - 1])) tm.put(failure_rate[i - 1], new Stack<>());
            tm.get(failure_rate[i - 1]).push(i);
        }
        
        int index = 0;
        while (tm.size() > 0) {
            Stack<Integer> value = tm.pollFirstEntry().getValue();
            while (value.size() > 0) answer[index++] = value.pop();
        }
        return answer;
    }
}
