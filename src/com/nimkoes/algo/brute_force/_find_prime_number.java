package com.nimkoes.algo.brute_force;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _find_prime_number {

    Set<String> powerSet = new HashSet<>();
    Set<Integer> permSet = new HashSet<>();

    int arrPSetSize;
    boolean[] arrPSet;
    String[] arrTargetStr;

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();

        _find_prime_number simulate = new _find_prime_number(tcNum);
        int result = simulate.solution(simulate.getNumbers());
        System.out.println(result);
        sc.close();
    }

    public int solution(String numbers) {
        int answer;
        arrTargetStr = numbers.split("");

        // get powerset
        arrPSetSize = arrTargetStr.length;
        arrPSet = new boolean[arrPSetSize];
        getPowerSet(0);

        // get powerset's permutation
        for(String target : powerSet) {
            getPermSet(target, 0);
        }

        // check is prime number
        answer = permSet.size();
        for(int pn : permSet) {
            for(int i = 2; i < pn; ++i) {
                if(pn % i == 0) {
                    --answer;
                    break;
                }
            }
        }

        return answer;
    }

    public void getPowerSet(int k) {
        if(k == arrPSetSize) {
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < arrPSetSize; ++i) if(arrPSet[i]) result.append(arrTargetStr[i]);
            if(!result.toString().equals("") && !result.toString().equals("0") && !result.toString().equals("1") && !powerSet.contains(result.toString())) powerSet.add(result.toString());
            return;
        }

        arrPSet[k] = false;
        getPowerSet(k+1);
        arrPSet[k] = true;
        getPowerSet(k+1);
    }

    public void getPermSet(String target, int startIndex) {
        String[] t = target.split("");
        perm(t, startIndex);
    }

    public void perm(String[] t, int pivot) {
        int tSize = t.length;
        if(pivot == tSize) {
            int o = Integer.parseInt(String.join("", t));
            if((o != 1) && (o != 0) && !permSet.contains(o)) permSet.add(o);
        }

        for(int i = pivot; i < tSize; ++i) {
            swap(t, i, pivot);
            perm(t, pivot+1);
            swap(t, i, pivot);
        }
    }

    public void swap(String[] t, int i, int j) {
        String temp = t[i];
        t[i] = t[j];
        t[j] = temp;
    }

    /*
     * SET TEST PARAM
     */

    private String numbers;

    public _find_prime_number(int tcNum) {
        switch (tcNum) {
            case 1:
                numbers = "17";
                break;
            case 2:
                numbers = "011";
                break;
        }
    }

    public String getNumbers() {
        return numbers;
    }
}