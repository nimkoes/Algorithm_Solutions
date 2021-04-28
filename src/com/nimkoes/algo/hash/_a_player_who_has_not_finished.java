package com.nimkoes.algo.hash;

import java.util.Arrays;
import java.util.Scanner;

public class _a_player_who_has_not_finished {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 3) : ");
        int tcNum = sc.nextInt();

        _a_player_who_has_not_finished simulate = new _a_player_who_has_not_finished(tcNum);
        String result = simulate.solution(simulate.getParticipant(), simulate.getCompletion());
        System.out.println(result);

        sc.close();
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        int loopCnt = completion.length;
        for(int i = 0; i < loopCnt; ++i) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }
        return !answer.equals("") ? answer : participant[participant.length-1];
    }

    /*
     * SET TEST PARAM
     */

    private String[] participant;
    private String[] completion;

    public _a_player_who_has_not_finished(int tcNum) {
        switch (tcNum) {
            case 1:
                participant = new String[] {"leo", "kiki", "eden"};
                completion = new String[] {"eden", "kiki"};
                break;
            case 2:
                participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
                completion = new String[] {"josipa", "filipa", "marina", "nikola"};
                break;
            case 3:
                participant = new String[] {"mislav", "stanko", "mislav", "ana"};
                completion = new String[] {"stanko", "ana", "mislav"};
                break;
        }
    }

    public String[] getParticipant() {
        return participant;
    }

    public String[] getCompletion() {
        return completion;
    }
}
