package com.nimkoes.algo.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class _003_number_of_124_countries {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 4) : ");
        int tcNum = sc.nextInt();
        _003_number_of_124_countries simulate = new _003_number_of_124_countries(tcNum);
        String result = simulate.solution(simulate.getN());
        System.out.println(result);
        sc.close();
    }

    public String solution(int n) {
        String answer = "";
        String[] canUse = new String[] {"4", "1", "2"};
        int m = 0;

        while(n != 0) {
            m = n % 3;
            n /= 3;
            if(m == 0) --n;
            answer = canUse[m] + answer;
        }

        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int n;

    public _003_number_of_124_countries(int tcNum) {
        switch (tcNum) {
            case 1:
                n = 1;
                break;
            case 2:
                n = 2;
                break;
            case 3:
                n = 3;
                break;
            case 4:
                n = 4;
                break;
        }
    }

    public int getN() {
        return n;
    }
}
