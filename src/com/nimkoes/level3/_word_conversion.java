package com.nimkoes.level3;

public class _word_conversion {
    int min = 52;

    public int solution(String begin, String target, String[] words) {
        for (int i = 0; i < words.length; ++i) {
            boolean[] visited = new boolean[words.length];
            check(i, visited, begin.split(""), target.split(""), words, 0);
        }

        return min == 52 ? 0 : min;
    }

    public void check(int index, boolean[] visited, String[] b, String[] t, String[] w, int depth) {

        if (compare(b, t) == 0) {
            min = Math.min(min, depth);
            return;
        }

        ++depth;
        visited[index] = true;

        if (depth >= min) return;

        for (int i = 0; i < w.length; ++i) {
            if (!visited[i]) {
                if (compare(b, w[i].split("")) == 1) {
                    check(i, visited, w[i].split(""), t, w, depth);
                }
            }
        }
    }

    public int compare(String[] s1, String[] s2) {
        int diffCnt = 0;
        for (int i = 0; i < s1.length; ++i) {
            if (!s1[i].equals(s2[i])) {
                ++diffCnt;
            }
            if (diffCnt > 2) break;
        }
        return diffCnt;
    }
}
