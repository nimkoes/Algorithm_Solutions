package com.nimkoes.level1;

public class _find_kim_seobang_in_seoul {
    public String solution(String[] seoul) {
        int index = 0;
        for (String elem : seoul) {
            if (elem.equals("Kim")) break;
            ++index;
        }
        return "김서방은 " + index + "에 있다";
    }
}
