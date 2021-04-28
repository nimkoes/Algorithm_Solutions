package com.nimkoes.algo.bfs_dfs;

import java.util.Arrays;
import java.util.Scanner;

public class _network {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();

        _network simulate = new _network(tcNum);
        System.out.println(simulate.solution(simulate.getN(), simulate.getComputers()));
        sc.close();
    }

    boolean[] visited;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        Arrays.stream(computers).forEach(
                com -> {
                    System.out.print(" : ");
                    Arrays.stream(com).forEach(val -> System.out.print(val + " : "));
                    System.out.println();
                }
        );

        for (int i = 0; i < n; ++i) visited[i] = false;

        for (int i = 0; i < n; ++i) {
            System.out.println(">>> main call !! visited[" + i + "] :: " + visited[i]);
            if (!visited[i]) {
                dfs(i, computers);
                ++answer;
            }
        }

        return answer;
    }

    public void dfs(int i, int[][] computers) {
        System.out.println("call node no [" + i + "]");
        visited[i] = true;

        for (int k = 0; k < computers.length; ++k) {
            System.out.println("\tvisited check [" + k + "] node : " + visited[k]);
            System.out.println("\tcomputers[" + i + "][" + k + "] : " + computers[i][k]);
            if (!visited[k] && computers[i][k] == 1) {
                dfs(k, computers);
            }
        }
        System.out.println("end call node no [" + i + "]");
    }


    /*
     * SET TEST PARAM
     */

    private int n;
    private int[][] computers;

    public _network(int tcNum) {
        switch (tcNum) {
            case 1:
                n = 3;
                computers = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
                break;
            case 2:
                n = 3;
                computers = new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
                break;
        }
    }

    public int getN() {
        return n;
    }

    public int[][] getComputers() {
        return computers;
    }
}