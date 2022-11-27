package com.nimkoes.programmers.level2;

public class Solution_010 {
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        long[][] pic = new long[m][n];
        for (int i = 0; i < m; ++i) for (int j = 0; j < n; ++j) pic[i][j] = picture[i][j];
        
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (pic[i][j] != 0L) {
                    ++numberOfArea;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, check(i, j, m, n, pic[i][j], pic));
                }
            }
        }
        
        return new int[]{numberOfArea, maxSizeOfOneArea};
    }
    
    public int check(int x, int y, int m, int n, long ckVal, long[][] pic) {
        if (x < 0 || y < 0 || x >= m || y >= n) return 0;
        if (pic[x][y] == 0L) return 0;
        if (pic[x][y] != ckVal) return 0;
        
        pic[x][y] = 0L;
        
        return 1 + check(x - 1, y, m, n, ckVal, pic)
                + check(x + 1, y, m, n, ckVal, pic)
                + check(x, y + 1, m, n, ckVal, pic)
                + check(x, y - 1, m, n, ckVal, pic);
    }
}
