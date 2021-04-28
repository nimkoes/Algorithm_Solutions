package com.nimkoes.algo.level_1;

import java.util.Scanner;

public class _sum_between_two_integers {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 3) : ");
        int tcNum = sc.nextInt();
        _sum_between_two_integers simulate = new _sum_between_two_integers(tcNum);
        long result = simulate.solution(simulate.getA(), simulate.getB());
        System.out.println(result);

        sc.close();
    }

    public long solution(int a, int b) {
        long answer = 0;

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for(int i = min; i <= max; ++i) {
            answer += i;
        }

        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int a;
    private int b;

    public _sum_between_two_integers(int tcNum) {
        switch (tcNum) {
            case 1:
                a = 3;
                b = 5;
                break;
            case 2:
                a = 3;
                b = 3;
                break;
            case 3:
                a = 5;
                b = 3;
                break;
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}