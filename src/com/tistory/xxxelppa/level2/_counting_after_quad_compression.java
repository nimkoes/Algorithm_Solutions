package com.tistory.xxxelppa.level2;

public class _counting_after_quad_compression {
    int[] answer;
    
    public int[] solution(int[][] arr) {
        answer = new int[2];
        check(arr, 0, 0, arr.length);
        return answer;
    }
    
    public void check(int[][] arr, int x, int y, int size) {
        if (size == 1) {
            ++answer[arr[x][y]];
            return;
        }
        int target = arr[x][y];
        boolean result = true;
        for (int i = x; i < x + size; ++i) {
            for (int j = y; j < y + size; ++j) {
                if (target != arr[i][j]) {
                    result = false;
                    break;
                }
            }
        }
        
        if (result) {
            ++answer[target];
        } else {
            int sub = size >> 1;
            check(arr, x, y, sub);
            check(arr, x + sub, y, sub);
            check(arr, x, y + sub, sub);
            check(arr, x + sub, y + sub, sub);
        }
    }
}
