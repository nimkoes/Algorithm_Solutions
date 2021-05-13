package com.tistory.xxxelppa.level2;

import java.util.ArrayList;
import java.util.HashMap;

public class _compression {
    HashMap<String, Integer> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    char[] arr;
    int num = 1;

    public int[] solution(String msg) {

        for (int i = 0; i < 27; i++) {
            map.put(String.valueOf((char) (65 + i)), i + 1);
        }
        arr = msg.toCharArray();

        do {
            String tmp;
            if (num == arr.length) tmp = "" + arr[num - 1];
            else tmp = "" + arr[num - 1] + arr[num];

            encoding(tmp);
        } while (num <= arr.length);

        int[] answer = new int[list.size()];
        int size = 0;
        for (int i : list) {
            answer[size++] = i;
        }

        return answer;
    }

    void encoding(String tmp) {
        if (map.containsKey(tmp) && num < arr.length - 1) {
            encoding(tmp + arr[++num]);
        } else if (map.containsKey(tmp)) {
            num += 2;
            list.add(map.get(tmp));
        } else {
            map.put(tmp, map.size());
            tmp = tmp.substring(0, tmp.length() - 1);
            num++;
            list.add(map.get(tmp));
        }
    }
}
