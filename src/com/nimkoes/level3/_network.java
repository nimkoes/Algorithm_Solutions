package com.nimkoes.level3;

public class _network {
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        
        for (int i = 0; i < n; ++i) visited[i] = false;
        
        for (int i = 0; i < n; ++i) {
            if (!visited[i]) {
                dfs(i, computers);
                ++answer;
            }
        }
        
        return answer;
    }
    
    public void dfs(int i, int[][] computers) {
        visited[i] = true;
        
        for (int k = 0; k < computers.length; ++k) {
            if (!visited[k] && computers[i][k] == 1) {
                dfs(k, computers);
            }
        }
    }
}
