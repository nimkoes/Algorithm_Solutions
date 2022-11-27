package com.nimkoes.programmers.level3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class _travel_route {

    Stack<String> route = new Stack<>();
    Stack<Integer> routeNo = new Stack<>();
    boolean[] visited;

    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length + 1];
        visited = new boolean[tickets.length];

        Arrays.sort(tickets, Comparator.comparing((String[] o) -> o[1]).thenComparing(o -> o[0]));

        makeRoute(tickets, visited, "ICN");

        for (int i = answer.length - 1; i >= 0; --i) answer[i] = route.pop();
        return answer;
    }

    public void makeRoute(String[][] tickets, boolean[] visited, String depStn) {
        route.push(depStn);
        routeNo.push(getRouteNo(tickets, depStn));

        if (route.size() > tickets.length) return;

        if (routeNo.peek() == -1) {
            route.pop();
            routeNo.pop();

            int k;
            while ((k = getRouteNo(tickets, route.peek())) == -1) {
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
        for (int i = 0; i < tickets.length; ++i) {
            if (!visited[i] && tickets[i][0].equals(depStn)) {
                return i;
            }
        }
        return -1;
    }
}
