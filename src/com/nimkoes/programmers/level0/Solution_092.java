package com.nimkoes.programmers.level0;

import java.util.HashMap;
import java.util.Iterator;

public class Solution_092 {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        int max = -1;
        for (int elem : array) {
            int v = hm.getOrDefault(elem, 0) + 1;
            hm.put(elem, v);
            max = Math.max(max, v);
        }

        Iterator it = hm.entrySet().iterator();
        boolean flag = false;
        while (it.hasNext()) {
            HashMap.Entry<Integer, Integer> elem = (HashMap.Entry) it.next();

            if (flag && elem.getValue() == max) {
                return -1;
            }

            if (elem.getValue() == max) {
                answer = elem.getKey();
                flag = true;
            }
        }

        return answer;
    }
}
