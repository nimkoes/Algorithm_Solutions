package com.nimkoes.level0;

public class Solution_095 {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        String[] token = polynomial.split(" \\+ ");
        int x = 0, c = 0;
        for (String elem : token) {
            if (elem.indexOf("x") != -1) {
                String x_num = elem.replace("x", "");
                x += Integer.parseInt("".equals(x_num) ? "1" : x_num);
            } else {
                c += Integer.parseInt(elem);
            }
        }

        if (x != 0) sb.append((x == 1 ? "" : x) + "x");
        if (x != 0 && c != 0) sb.append(" + ");
        if (c != 0) sb.append(c);

        return sb.toString();
    }
}

