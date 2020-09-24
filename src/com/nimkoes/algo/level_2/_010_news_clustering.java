package com.nimkoes.algo.level_2;

import java.util.HashMap;
import java.util.Scanner;

public class _010_news_clustering {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 4) : ");
        int tcNum = sc.nextInt();
        _010_news_clustering simulate = new _010_news_clustering(tcNum);
        int result = simulate.solution(simulate.getStr1(), simulate.getStr2());
        System.out.println(result);

        sc.close();
    }

    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        HashMap<String, Integer> hm_str1 = getGroup(str1);
        HashMap<String, Integer> hm_str2 = getGroup(str2);

        if(hm_str1.size() == 0 && hm_str2.size() == 0) return 65536;
        if(hm_str1.size() == 0 || hm_str2.size() == 0) return 0;

        int intersection_size = 0;
        int union_size = 0;

        for (String s : hm_str1.keySet()) {
            if (hm_str2.containsKey(s)) {
                intersection_size += Math.min(hm_str1.get(s), hm_str2.get(s));
                union_size += Math.max(hm_str1.get(s), hm_str2.get(s));
                hm_str2.remove(s);
            } else {
                union_size += hm_str1.get(s);
            }
        }
        for (String s : hm_str2.keySet()) union_size += hm_str2.get(s);
        double temp = (double)intersection_size / union_size * 65536;
        return (int)temp;
    }

    private HashMap<String, Integer> getGroup(String str) {
        HashMap<String, Integer> result = new HashMap<>();

        for(int i = 0; i < str.length()-1; ++i) {
            int aNum_1 = str.charAt(i);
            int aNum_2 = str.charAt(i+1);

            if(aNum_1 < 97 || aNum_1 > 122) continue;
            if(aNum_2 < 97 || aNum_2 > 122) {
                ++i;
                continue;
            }

            String temp = str.substring(i, i+2);
            result.put(temp, result.getOrDefault(temp, 0) + 1);
        }

        return result;
    }

    /*
     * SET TEST PARAM
     */

    private String str1;
    private String str2;

    public _010_news_clustering(int tcNum) {
        switch (tcNum) {
            case 1:
                str1 = "FRANCE";
                str2 = "french";
                break;
            case 2:
                str1 = "handshake";
                str2 = "shake hands";
                break;
            case 3:
                str1 = "aa1+aa2";
                str2 = "AAAA12";
                break;
            case 4:
                str1 = "E=M*C^2";
                str2 = "e=m*c^2";
                break;
        }
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }
}