package com.nimkoes.algo.bfs_dfs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class _004_travle_route {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();

        _004_travle_route simulate = new _004_travle_route(tcNum);
        String[] result = simulate.solution(simulate.getTickets());
        System.out.println(Arrays.toString(result));
        sc.close();
    }

    Stack<String> route = new Stack<>();
    Stack<Integer> routeNo = new Stack<>();
    boolean[] visited;

    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length+1];
        visited = new boolean[tickets.length];

        Arrays.sort(tickets, (o1, o2) -> {
            int result = o1[1].compareTo(o2[1]);
            return result == 0 ? o1[0].compareTo(o2[0]) : result;
        });

        makeRoute(tickets, visited, "ICN");

        for(int i = answer.length-1; i >= 0; --i) answer[i] = route.pop();
        return answer;
    }

    public void makeRoute(String[][] tickets, boolean[] visited, String depStn) {
        route.push(depStn);
        routeNo.push(getRouteNo(tickets, depStn));

        if(route.size() > tickets.length) return;

        if(routeNo.peek() == -1) {
            route.pop();
            routeNo.pop();

            int k;
            while((k = getRouteNo(tickets, route.peek())) == -1) {
                route.pop();
                visited[routeNo.pop()] = false;
            }
            visited[routeNo.peek()] = false;
            route.pop();
            routeNo.pop();

            route.push(tickets[k][0]);
            routeNo.push(k);
        }

        visited[routeNo.peek()] = true;
        makeRoute(tickets, visited, tickets[routeNo.peek()][1]);
    }

    public int getRouteNo(String[][] tickets, String depStn) {
        for(int i = 0; i < tickets.length; ++i) {
            if(!visited[i] && tickets[i][0].equals(depStn)) {
                return i;
            }
        }
        return -1;
    }

    /*
     * SET TEST PARAM
     */

    private String[][] tickets;

    public _004_travle_route(int tcNum) {
        switch (tcNum) {
            case 1:
                tickets = new String[][] {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
                break;
            case 2:
                tickets = new String[][] {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
                break;
        }
    }

    public String[][] getTickets() {
        return tickets;
    }
}

