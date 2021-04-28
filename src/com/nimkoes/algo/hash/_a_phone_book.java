package com.nimkoes.algo.hash;

import java.util.HashSet;
import java.util.Scanner;

public class _a_phone_book {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 3) : ");
        int tcNum = sc.nextInt();

        _a_phone_book pocd = new _a_phone_book(tcNum);
        Boolean result = pocd.solution(pocd.getPhone_book());
        System.out.println(result);

        sc.close();
    }

    public Boolean solution(String[] phone_book) {
        Boolean answer = true;

        HashSet<String> hs = new HashSet<>();
        for(String str : phone_book) {
            if(hs.isEmpty()) {
                hs.add(str);
            } else {
                for(String target : hs) {
                    if(str.startsWith(target) || target.startsWith(str)) return false;
                }
                hs.add(str);
            }
        }

        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private String[] phone_book;

    public _a_phone_book(int tcNum) {
        switch (tcNum) {
            case 1:
                phone_book = new String[] {"119", "97674223", "1195524421"};
                break;
            case 2:
                phone_book = new String[] {"123", "456", "789"};
                break;
            case 3:
                phone_book = new String[] {"12", "123", "1235", "567", "88"};
                break;
        }
    }

    public String[] getPhone_book() {
        return phone_book;
    }
}
