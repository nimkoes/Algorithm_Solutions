package com.tistory.xxxelppa.level2;

public class _make_a_jadencase_string {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int size = s.length();
        s = s.toLowerCase();
        
        boolean isFirst = true;
        for (int i = 0; i < size; ++i) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                sb.append(ch);
                isFirst = true;
            } else if (isFirst && ch >= 'a' && ch <= 'z') {
                sb.append((char) (ch - 32));
                isFirst = false;
            } else {
                sb.append(ch);
                isFirst = false;
            }
        }
        return sb.toString();
    }
}
