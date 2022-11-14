package com.nimkoes.level0;

public class Solution_080 {
    public int solution(String[] spell, String[] dic) {
        for (String d : dic) {
            boolean find = true;
            for (String s : spell) {
                if (d.indexOf(s) == -1) {
                    find = false;
                    break;
                }
            }
            if (find) return 1;
        }
        return 2;
    }
}
