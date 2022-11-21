package com.nimkoes.level2;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Solution_021 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        class Truck {
            int passingTime;
            int weight;
            
            Truck(int weight) {
                this.weight = weight;
            }
            
            public boolean isPassed() {
                return bridge_length <= this.passingTime;
            }
            
            public void addTime() {
                ++this.passingTime;
            }
            
            public int getWeight() {
                return this.weight;
            }
        }
        
        Queue<Truck> load = new LinkedList<>();
        Queue<Truck> q = new LinkedList<>();
        for (int e : truck_weights) q.add(new Truck(e));
        
        int currentWeight = 0;
        int passingCount = 0;
        
        Truck truck;
        while (passingCount < truck_weights.length) {
            truck = q.peek();
            ++answer;
            if (truck != null) {
                if (currentWeight + truck.getWeight() <= weight) {
                    currentWeight += truck.getWeight();
                    load.add(q.poll());
                }
            }
            
            load.forEach(Truck::addTime);
            
            if (load.peek().isPassed()) {
                ++passingCount;
                currentWeight -= Objects.requireNonNull(load.poll()).getWeight();
            }
            
        }
        
        return answer + 1;
    }
}
