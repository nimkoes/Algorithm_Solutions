package com.tistory.xxxelppa.level1;

import java.util.HashMap;

public class _number_string_and_english_word {
    public int solution(String s) {
        int len = s.length();
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("ZERO", 0);
        hm.put("ONE", 1);
        hm.put("TWO", 2);
        hm.put("THREE", 3);
        hm.put("FOUR", 4);
        hm.put("FIVE", 5);
        hm.put("SIX", 6);
        hm.put("SEVEN", 7);
        hm.put("EIGHT", 8);
        hm.put("NINE", 9);

        for (int i = 0; i < len; ++i) {
            char temp = s.charAt(i);
            sb.append(temp);

            if (temp >= '0' && temp <= '9') {
                result.append(temp);
                sb = new StringBuilder();
            }

            if (hm.containsKey(sb.toString().toUpperCase())) {
                result.append(hm.get(sb.toString().toUpperCase()));
                sb = new StringBuilder();
            }
        }

        return Integer.parseInt(result.toString());
    }
}
