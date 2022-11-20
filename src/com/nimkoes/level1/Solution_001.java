package com.nimkoes.level1;

public class Solution_001 {
    public String solution(int a, int b) {
        
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String[] year = new String[366];
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int want_day = 0;
        
        for (int i = 0; i < year.length; ++i) year[i] = day[(i + 5) % 7];
        for (int i = 0; i < a - 1; ++i) want_day += month[i];
        
        want_day += b - 1;
        
        return year[want_day];
    }
}
