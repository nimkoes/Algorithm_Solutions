package com.nimkoes.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class _i_hate_the_same_number {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        answer =
                Arrays.stream(arr).collect(
                        () -> new ArrayList<Integer>(),
                        (a, b) -> {
                            if (a.isEmpty()) {
                                a.add(b);
                            } else {
                                if (!a.get(a.size() - 1).equals(b)) {
                                    a.add(b);
                                }
                            }
                        },
                        (r1, r2) -> r1.addAll(r2)
                ).stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}
