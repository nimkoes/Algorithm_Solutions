package com.nimkoes.algo.monthly_code_challenge.day01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class _002_triangular_snail {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 3) : ");
        int tcNum = sc.nextInt();
        _002_triangular_snail simulate = new _002_triangular_snail(tcNum);
        int[] result = simulate.solution(simulate.getN());
        System.out.println(Arrays.toString(result));
        sc.close();
    }

    public int[] solution(int n) {
        int[] answer = new int[(n*(n+1))/2];
        int[][] matrix = new int[n][n];

        int x = -1, y = 0;
        int num = 1;

        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                if (i % 3 == 0) {
                    ++x;
                } else if (i % 3 == 1) {
                    ++y;
                } else if (i % 3 == 2) {
                    --x;
                    --y;
                }
                matrix[x][y] = num++;
            }
        }

        int k = 0;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(matrix[i][j] == 0) break;
                answer[k++] = matrix[i][j];
            }
        }

        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int n;

    public _002_triangular_snail(int tcNum) {
        switch (tcNum) {
            case 1:
                n = 4;
                break;
            case 2:
                n = 5;
                break;
            case 3:
                n = 6;
                break;
        }
    }

    public int getN() {
        return n;
    }
}
