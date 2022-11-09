package com.nimkoes.level1;

public class _reverse_order_the_ternary_system {
    public int solution(int n) {
        int answer = 0;
        String t = make3(n);
        
        // 3진법 문자열을 뒤쪽부터 하나씩 확인하며
        // 10진법 숫자로 만들어 준다.
        for (int i = t.length() - 1, j = 1; i >= 0; --i, j *= 3) answer += (((int) t.charAt(i) - 48) * j);
        return answer;
    }
    
    // 3진법 문자열을 반환
    public String make3(int n) {
        StringBuilder sb = new StringBuilder();
        int x = -1, y;
        while (x != 0) {
            x = n / 3;
            y = n % 3;
            n = x;
            sb.append(y);
        }
        return sb.toString();
    }
}
