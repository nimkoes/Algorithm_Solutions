package com.nimkoes.algo.level_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _truck_passing_the_bridge {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 3) : ");
        int tcNum = sc.nextInt();
        _truck_passing_the_bridge simulate = new _truck_passing_the_bridge(tcNum);
        int result = simulate.solution(simulate.getBridge_length(), simulate.getWeight(), simulate.getTruck_weights());
        System.out.println(result);

        sc.close();
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        class Truck {
            int passingTime;
            int weight;

            Truck(int weight) {
                this.weight = weight;
            }

            public boolean isPassed() {
                if(bridge_length <= this.passingTime) {
                    return true;
                }
                return false;
            }
            public void addTime() { ++this.passingTime; }
            public int getWeight() { return this.weight; }
        }


        Queue<Truck> load = new LinkedList<>();
        Queue<Truck> q = new LinkedList<>();
        for(int e : truck_weights) q.add(new Truck(e));

        int currentWeight = 0;
        int passingCount = 0;

        Truck truck;
        while(passingCount < truck_weights.length) {
            truck = q.peek();
            ++answer;
            if(truck != null) {
                if(currentWeight + truck.getWeight() <= weight) {
                    currentWeight += truck.getWeight();
                    load.add(q.poll());
                }
            }

            load.stream().forEach(Truck::addTime);

            if(load.peek().isPassed()) {
                ++passingCount;
                currentWeight -= load.poll().getWeight();
            }

        }

        return answer+1;
    }

    /*
     * SET TEST PARAM
     */

    private int bridge_length;
    private int weight;
    private int[] truck_weights;

    public _truck_passing_the_bridge(int tcNum) {
        switch (tcNum) {
            case 1:
                bridge_length = 2;
                weight = 10;
                truck_weights = new int[] {7, 4, 5, 6};
                break;
            case 2:
                bridge_length = 100;
                weight = 100;
                truck_weights = new int[] {10};
                break;
            case 3:
                bridge_length = 100;
                weight = 100;
                truck_weights = new int[] {10,10,10,10,10,10,10,10,10,10};
                break;
        }
    }

    public int getBridge_length() {
        return bridge_length;
    }

    public int getWeight() {
        return weight;
    }

    public int[] getTruck_weights() {
        return truck_weights;
    }
}