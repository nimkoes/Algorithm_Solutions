package com.nimkoes.algo.sort;

import java.util.Arrays;
import java.util.Collections;

public class _H_index {
    public static void main(String[] ar) {
        _H_index simulate = new _H_index();
        int result = simulate.solution(simulate.getCitations());
        System.out.println(result);
    }

    public int solution(int[] citations) {
        int answer = 0;

        Integer[] orderedArr = Arrays.stream(citations)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);

        if(orderedArr[0] == 0) return 0;

        for(int i = 1; i <= orderedArr.length; ++i) {
            if(orderedArr[i-1] < i) {
                answer = i-1;
                break;
            }
        }

        return answer == 0 ? orderedArr.length : answer;
    }

    /*
     * SET TEST PARAM
     */

    private int[] citations;

    public _H_index() {
        citations = new int[] {3, 0, 6, 1, 5};
    }

    public int[] getCitations() {
        return citations;
    }
}