package com.tistory.xxxelppa.level1;

import java.util.HashMap;

public class _number_string_and_english_word {
    public int solution(String s) {
        int len = s.length();
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("zero", 0);
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("three", 3);
        hm.put("four", 4);
        hm.put("five", 5);
        hm.put("six", 6);
        hm.put("seven", 7);
        hm.put("eight", 8);
        hm.put("nine", 9);

        for (int i = 0; i < len; ++i) {
            char temp = s.charAt(i);
            sb.append(temp);

            if (temp >= '0' && temp <= '9') {
                result.append(temp);
                sb = new StringBuilder();
            }

            if (hm.containsKey(sb.toString())) {
                result.append(hm.get(sb.toString()));
                sb = new StringBuilder();
            }
        }

        return Integer.parseInt(result.toString());
    }
}
