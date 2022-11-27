package com.nimkoes.programmers.level0;

import java.util.Scanner;

public class Solution_046 {
    private static final String STAR = "*";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder("*");
        for (int i = 0; i < n; ++i, sb.append(STAR)) System.out.println(sb);
    }
}
