package com.nimkoes.algo.level_2;

import java.util.Scanner;
import java.util.TreeSet;

public class _string_compression {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 5) : ");
        int tcNum = sc.nextInt();
        _string_compression simulate = new _string_compression(tcNum);
        int result = simulate.solution(simulate.getS());
        System.out.println(result);

        sc.close();
    }

    public int solution(String s) {

        if(s.length() == 1) return 1;

        TreeSet<Integer> ts = new TreeSet<>();

        int loopCnt = s.length() / 2;
        int start = 0;
        int end = 0;
        int dupCnt = 0;

        String base = "";
        String comp = "";
        String makeStr = "";

        boolean stop = false;

        for(int i = 1; i <= loopCnt; ++i) {
            base = s.substring(0, i);
            dupCnt = 0;
            makeStr = "";
            stop = false;
            for(int j = 0; j < s.length(); j += i) {
                start = j;
                end = j + i;

                if(end > s.length()) {
                    comp = base + s.substring(start, s.length());
                    continue;
                }

                comp = s.substring(start, end);
                if(base.equals(comp)) {
                    ++dupCnt;
                } else {
                    makeStr += (dupCnt == 1 ? "" : dupCnt) + base;
                    base = s.substring(start, end);
                    dupCnt = 1;
                }

                if(ts.size() > 0 && makeStr.length() >= ts.first()) {
                    stop = true;
                    break;
                }
            }

            if(dupCnt > 1) makeStr += dupCnt + comp;
            else makeStr += comp;
            if(!stop) ts.add(makeStr.length());
        }

        return ts.first();
    }

    /*
     * SET TEST PARAM
     */

    private String s;

    public _string_compression(int tcNum) {
        switch (tcNum) {
            case 1:
                s = "aabbaccc";
                break;
            case 2:
                s = "ababcdcdababcdcd";
                break;
            case 3:
                s = "abcabcdede";
                break;
            case 4:
                s = "abcabcabcabcdededededede";
                break;
            case 5:
                s = "xababcdcdababcdcd";
                break;
        }
    }

    public String getS() {
        return s;
    }
}