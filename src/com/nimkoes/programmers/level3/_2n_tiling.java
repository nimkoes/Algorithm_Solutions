package com.nimkoes.programmers.level3;

public class _2n_tiling {
    int[] memory;

    public int solution(int n) {
        memory = new int[n];

        if (n < 4) return n;

        memory[0] = 1;
        memory[1] = 2;
        for (int i = 2; i < n; ++i) memory[i] = (memory[i - 2] + memory[i - 1]) % 1000000007;

        return memory[n - 1];
    }
}
