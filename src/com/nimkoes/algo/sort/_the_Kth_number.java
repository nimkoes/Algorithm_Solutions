package com.nimkoes.algo.sort;

import java.util.Arrays;

public class _the_Kth_number {
    public static void main(String[] ar) {
        _the_Kth_number simulate = new _the_Kth_number();
        int[] result = simulate.solution(simulate.getArray(), simulate.getCommands());
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] array, int[][] commands) {
        int size = commands.length, idx = 0;
        int[] answer = new int[size], temp;

        for(int[] com : commands) {
            com = commands[idx];
            temp = Arrays.copyOfRange(array, com[0]-1, com[1]);
            Arrays.sort(temp);
            answer[idx++] = temp[com[2]-1];
        }
        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int[] array;
    private int[][] commands;

    public _the_Kth_number() {
        array = new int[] {1, 5, 2, 6, 3, 7, 4};
        commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    }

    public int[] getArray() {
        return array;
    }

    public int[][] getCommands() {
        return commands;
    }
}