package com.nimkoes.algo.monthly_code_challenge.day01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class _001_pick_two_and_add {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();
        _001_pick_two_and_add simulate = new _001_pick_two_and_add(tcNum);
        int[] result = simulate.solution(simulate.getNumbers());
        System.out.println(Arrays.toString(result));
        sc.close();
    }

    public int[] solution(int[] numbers) {
        int[] answer = {};

        TreeSet<Integer> tm = new TreeSet<>();

        int temp = -1;
        for(int i = 0; i < numbers.length-1; ++i) {
            for(int j = i+1; j < numbers.length; ++j) {
                temp = numbers[i] + numbers[j];
                tm.add(temp);
            }
        }

        answer = new int[tm.size()];
        int k = 0;
        for(int t : tm) {
            answer[k++] = t;
        }
        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int[] numbers;

    public _001_pick_two_and_add(int tcNum) {
        switch (tcNum) {
            case 1:
                numbers = new int[] {2, 1, 3, 4, 1};
                break;
            case 2:
                numbers = new int[] {5, 0, 2, 7};
                break;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}
