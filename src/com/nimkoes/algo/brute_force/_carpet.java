package com.nimkoes.algo.brute_force;

import java.util.Arrays;
import java.util.Scanner;

public class _carpet {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 3) : ");
        int tcNum = sc.nextInt();

        _carpet simulate = new _carpet(tcNum);
        int[] result = simulate.solution(simulate.getBrown(), simulate.getYellow());
        System.out.println(Arrays.toString(result));
        sc.close();
    }

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int totalBlock = brown + yellow;

        for(int i = totalBlock/2; i > 2 ; --i) {
            if(totalBlock % i == 0) {
                if(((i-2) * ((totalBlock / i) - 2)) == yellow) {
                    answer[0] = i;
                    answer[1] = totalBlock / i;
                    break;
                }
            }
        }

        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int brown;
    private int yellow;

    public _carpet(int tcNum) {
        switch (tcNum) {
            case 1:
                brown = 10;
                yellow = 2;
                break;
            case 2:
                brown = 8;
                yellow = 1;
                break;
            case 3:
                brown = 24;
                yellow = 24;
                break;
        }
    }

    public int getBrown() {
        return brown;
    }

    public int getYellow() {
        return yellow;
    }
}