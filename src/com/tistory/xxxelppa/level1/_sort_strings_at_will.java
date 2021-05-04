package com.tistory.xxxelppa.level1;

import java.util.Arrays;
import java.util.Comparator;

public class _sort_strings_at_will {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.charAt(n) - o2.charAt(n);
                return result == 0 ? o1.compareTo(o2) : result;
            }
        });
        
        return strings;
    }
}
