package com.nimkoes.algo.monthly_code_challenge.day01;

import java.util.Scanner;
import java.util.TreeSet;

public class _003_pop_the_balloon {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();
        _003_pop_the_balloon simulate = new _003_pop_the_balloon(tcNum);
        int result = simulate.solution(simulate.getA());
        System.out.println(result);
        sc.close();
    }

    public int solution(int[] a) {
        int answer = 2;
        TreeSet<Integer> leftTM = new TreeSet<>();
        TreeSet<Integer> rightTM = new TreeSet<>();

        if(a.length <= 2) return a.length;

        for(int i = 2; i < a.length; ++i) rightTM.add(a[i]);

        for(int i = 1; i < a.length-1; ++i) {
            leftTM.add(a[i-1]);
            if(!(a[i] > leftTM.first() && a[i] > rightTM.first())) ++answer;
            rightTM.remove(a[i+1]);
        }

        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int[] a;

    public _003_pop_the_balloon(int tcNum) {
        switch (tcNum) {
            case 1:
                a = new int[] {9, -1, -5};
                break;
            case 2:
                a = new int[] {-16,27,65,-2,58,-92,-71,-68,-61,-33};
                break;
        }
    }

    public int[] getA() {
        return a;
    }
}
