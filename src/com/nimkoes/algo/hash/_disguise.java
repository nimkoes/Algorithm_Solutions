package com.nimkoes.algo.hash;

import java.util.HashMap;
import java.util.Scanner;

public class _disguise {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();

        _disguise simulate = new _disguise(tcNum);
        int result = simulate.solution(simulate.getClothes());
        System.out.println(result);

        sc.close();
    }

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();

        for(String[] s : clothes) hm.put(s[1], hm.getOrDefault(s[1], 1) + 1);
        for(String key : hm.keySet()) answer *= (hm.get(key));

        return answer-1;
    }

    /*
     * SET TEST PARAM
     */

    private String[][] clothes;

    public _disguise(int tcNum) {
        switch (tcNum) {
            case 1:
                clothes = new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
                break;
            case 2:
                clothes = new String[][] {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
                break;
        }
    }

    public String[][] getClothes() {
        return clothes;
    }
}