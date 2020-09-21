package com.nimkoes.algo.sort;

import java.util.*;
import java.util.stream.Collectors;

public class _002_the_largest_number {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();

        _002_the_largest_number simulate = new _002_the_largest_number(tcNum);
        System.out.println(simulate.solution(simulate.getNumbers()));
        sc.close();
    }

    public String solution(int[] numbers) {
        List<String> numberz = new ArrayList<>();
        for (int number : numbers) {
            Integer integer = number;
            String s = String.valueOf(integer);
            numberz.add(s);
        }
        numberz.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        return numberz.get(0).equals("0") ? "0" : String.join("", numberz);
    }

    /*
     * SET TEST PARAM
     */

    private int[] numbers;

    public _002_the_largest_number(int tcNum) {
        switch (tcNum) {
            case 1:
                numbers = new int[] {6, 10, 2};
                break;
            case 2:
                numbers = new int[] {3, 30, 34, 5, 9};
                break;
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}