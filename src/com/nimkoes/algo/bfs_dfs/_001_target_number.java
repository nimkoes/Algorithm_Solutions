package com.nimkoes.algo.bfs_dfs;

public class _001_target_number {
    public static void main(String[] ar) {
        _001_target_number simulate = new _001_target_number();
        int result = simulate.solution(simulate.getNumbers(), simulate.getTarget());
        System.out.println(result);
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        int mask = 1 << numbers.length;
        int sum;

        for(int i = 0; i < mask; ++i) {
            sum = 0;
            for(int j = 0; j < numbers.length; ++j) {
                if((i & 1 << j) != 0) {
                    sum -= numbers[j];
                } else {
                    sum += numbers[j];
                }
            }
            if(sum == target) ++answer;
        }
        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int[] numbers;
    private int target;

    public _001_target_number() {
        numbers = new int[] {1, 1, 1, 1, 1};
        target = 3;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getTarget() {
        return target;
    }
}