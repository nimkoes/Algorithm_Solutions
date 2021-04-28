package com.nimkoes.algo.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;

public class _i_hate_the_same_numbers {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();
        _i_hate_the_same_numbers simulate = new _i_hate_the_same_numbers(tcNum);
        int[] result = simulate.solution(simulate.getArr());
        System.out.println(Arrays.toString(result));
        sc.close();
    }

    public int[] solution(int []arr) {
        int[] answer;

        answer =
                Arrays.stream(arr).collect(
                        (Supplier<ArrayList<Integer>>) ArrayList::new,
                        (a, b) -> {
                            if(a.isEmpty()) {
                                a.add(b);
                            } else {
                                if(!a.get(a.size()-1).equals(b)) {
                                    a.add(b);
                                }
                            }
                        },
                        ArrayList::addAll
                ).stream().mapToInt(i -> i).toArray();

        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int[] arr;

    public _i_hate_the_same_numbers(int tcNum) {
        switch (tcNum) {
            case 1:
                arr = new int[] {1, 1, 3, 3, 0, 1, 1};
                break;
            case 2:
                arr = new int[] {4, 4, 4, 3, 3};
                break;
        }
    }

    public int[] getArr() {
        return arr;
    }
}
