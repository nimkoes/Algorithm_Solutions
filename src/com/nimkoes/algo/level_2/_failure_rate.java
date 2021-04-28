package com.nimkoes.algo.level_2;

import java.util.*;

public class _failure_rate {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();
        _failure_rate simulate = new _failure_rate(tcNum);
        int[] result = simulate.solution(simulate.getN(), simulate.getStages());
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failure_rate = new double[N];

        HashMap<Integer, Integer> hm = new HashMap<>();
        TreeMap<Double, Stack<Integer>> tm = new TreeMap<>(Collections.reverseOrder());

        for (int i : stages) hm.put(i, hm.getOrDefault(i, 0) + 1);

        int number_of_players_reaching_the_stage = hm.getOrDefault(N+1, 0);
        for(int i = N; i > 0; --i) {
            int number_of_players_who_did_not_clear_the_stage = hm.getOrDefault(i, 0);
            if (number_of_players_who_did_not_clear_the_stage != 0) number_of_players_reaching_the_stage += number_of_players_who_did_not_clear_the_stage;
            failure_rate[i-1] = number_of_players_reaching_the_stage == 0 ? 0.0
                    : (double)number_of_players_who_did_not_clear_the_stage / number_of_players_reaching_the_stage;
            if(!tm.containsKey(failure_rate[i-1])) tm.put(failure_rate[i-1], new Stack<>());
            tm.get(failure_rate[i - 1]).push(i);
        }

        int index = 0;
        while (tm.size() > 0) {
            Stack<Integer> value = tm.pollFirstEntry().getValue();
            while (value.size() > 0) answer[index++] = value.pop();
        }
        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int N;
    private int[] stages;

    public _failure_rate(int tcNum) {
        switch (tcNum) {
            case 1:
                N = 5;
                N = 2;
                stages = new int[] {2, 1, 2, 6, 2, 4, 3, 3};
                stages = new int[] {1, 1, 1};
                break;
            case 2:
                N = 4;
                stages = new int[] {4, 4, 4, 4, 4};
                break;
        }
    }

    public int getN() {
        return N;
    }

    public int[] getStages() {
        return stages;
    }
}
