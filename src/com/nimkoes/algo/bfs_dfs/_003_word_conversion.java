package com.nimkoes.algo.bfs_dfs;

import java.util.Scanner;

public class _003_word_conversion {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();

        _003_word_conversion simulate = new _003_word_conversion(tcNum);
        System.out.println(simulate.solution(simulate.getBegin(), simulate.getTarget(), simulate.getWords()));
        sc.close();
    }

    int min = 52;

    public int solution(String begin, String target, String[] words) {
        for(int i = 0; i < words.length; ++i) {
            boolean[] visited = new boolean[words.length];
            check(i, visited, begin.split(""), target.split(""), words, 0);
        }

        return min == 52 ? 0 : min;
    }


    public void check(int index, boolean[] visited, String[] b, String[] t, String[] w, int depth) {

        if(compare(b, t) == 0) {
            min = Math.min(min, depth);
            return;
        }

        ++depth;
        visited[index] = true;

        if(depth >= min) return;

        for(int i = 0; i < w.length; ++i) {
            if(!visited[i]) {
                if(compare(b, w[i].split("")) == 1) {
                    check(i, visited, w[i].split(""), t, w, depth);
                }
            }
        }
    }

    public int compare(String[] s1, String[] s2) {
        int diffCnt = 0;
        for(int i = 0; i < s1.length; ++i) {
            if(!s1[i].equals(s2[i])) {
                ++diffCnt;
            }
            if(diffCnt > 2) break;
        }
        return diffCnt;
    }


    /*
     * SET TEST PARAM
     */

    private String begin;
    private String target;
    private String[] words;

    public _003_word_conversion(int tcNum) {
        switch (tcNum) {
            case 1:
                begin = "hit";
                target = "cog";
                words = new String[] {"hot", "dot", "dog", "lot", "log", "cog"};
                break;
            case 2:
                begin = "hit";
                target = "cog";
                words = new String[] {"hot", "dot", "dog", "lot", "log"};
                break;
        }
    }

    public String getBegin() {
        return begin;
    }

    public String getTarget() {
        return target;
    }

    public String[] getWords() {
        return words;
    }
}