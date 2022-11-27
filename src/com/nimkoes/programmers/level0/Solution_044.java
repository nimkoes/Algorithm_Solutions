package com.nimkoes.programmers.level0;

public class Solution_044 {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (Character elem : rsp.toCharArray()) sb.append(getDefence(elem.toString()));
        return sb.toString();
    }

    private String getDefence(String offence) {
        switch (offence) {
            case "2": return "0";
            case "0": return "5";
            case "5": return "2";
            default: return "";
        }
    }
}
