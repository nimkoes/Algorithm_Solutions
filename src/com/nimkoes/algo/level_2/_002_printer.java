package com.nimkoes.algo.level_2;

import java.util.*;

public class _002_printer {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();
        _002_printer simulate = new _002_printer(tcNum);
        int result = simulate.solution(simulate.getPriorities(), simulate.getLocation());
        System.out.println(result);
        sc.close();
    }

    TreeMap<Integer, Integer> tm;
    Queue<Integer> pQueue, iQueue, resultQueue;

    public int solution(int[] priorities, int location) {
        int answer = 0;

        tm = new TreeMap<>(Collections.reverseOrder());
        pQueue = new LinkedList<>();
        iQueue = new LinkedList<>();
        resultQueue = new LinkedList<>();

        for(int i = 0; i < priorities.length; ++i) {
            pQueue.add(priorities[i]);
            iQueue.add(i);
            tm.put(priorities[i], tm.getOrDefault(priorities[i], 0) + 1);
        }

        makeQueue();

        for(int q : resultQueue) {
            ++answer;
            if(q == location) break;
        }
        return answer;
    }

    public void makeQueue() {

        if(tm.size() <= 0) return;

        int curPriority = pQueue.poll();
        int curIndex = iQueue.poll();

        if(tm.firstKey() == curPriority) {
            tm.put(tm.firstKey(), tm.get(tm.firstKey()) - 1);
            resultQueue.add(curIndex);
        } else {
            pQueue.add(curPriority);
            iQueue.add(curIndex);
        }

        if(tm.get(tm.firstKey()) == 0) tm.remove(tm.firstKey());

        makeQueue();
    }

    /*
     * SET TEST PARAM
     */

    private int[] priorities;
    private int location;

    public _002_printer(int tcNum) {
        switch (tcNum) {
            case 1:
                priorities = new int[] {2, 1, 3, 2};
                location = 2;
                break;
            case 2:
                priorities = new int[] {1, 1, 9, 1, 1, 1};
                location = 0;
                break;
        }
    }

    public int[] getPriorities() {
        return priorities;
    }

    public int getLocation() {
        return location;
    }
}
