package com.tistory.xxxelppa.level2;

public class _string_compression {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        if (s.length() == 1) return 1;
        
        int loopCnt = s.length() / 2;
        int start;
        int end;
        int cnt;
        int strLength = 0;
        
        String base;
        String comp = "";
        for (int i = 1; i <= loopCnt; ++i) {
            base = s.substring(0, i);
            cnt = 0;
            for (int j = 0; j < s.length(); j += i) {
                start = j;
                end = j + i;
                
                if (end > s.length()) end = s.length();
                comp = s.substring(start, end);
                
                if (base.equals(comp)) {
                    ++cnt;
                } else {
                    strLength += (cnt <= 1 ? 0 : (int) Math.log10(cnt) + 1) + base.length();
                    base = comp;
                    cnt = 1;
                }
            }
            strLength += (cnt <= 1 ? 0 : (int) Math.log10(cnt) + 1) + comp.length();
            answer = Math.min(answer, strLength);
            strLength = 0;
        }
        
        return answer;
    }
}
