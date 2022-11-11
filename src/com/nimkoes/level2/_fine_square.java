package com.nimkoes.level2;

public class _fine_square {
    public long solution(int w, int h) {
        long temp, gcd = w, n = h, n1, n2;
        
        while (n != 0) {
            temp = gcd % n;
            gcd = n;
            n = temp;
        }
        
        temp = (long) w * h;
        n1 = w / gcd;
        n2 = h / gcd;
        
        return temp - ((n1 + n2 - 1) * gcd);
    }
}