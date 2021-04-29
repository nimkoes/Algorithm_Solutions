package com.tistory.xxxelppa.level1;

import java.util.Stack;

public class _crane_game {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        // 집어올린 인형을 담을 바구니 생성
        Stack<Integer> basket = new Stack<>();
        
        int size = board.length;
        int moveCnt = moves.length;
    
        for (int move : moves) {
            // 주어진 board의 moves[m]-1 번째 열에서 최초로 0이 아닌 위치를 찾을 때까지 반복
            for (int i = 0; i < size; ++i) {
            
                // 0이 아니라는 것은, 해당 위치에 인형이 존재하여 집어올릴 수 있음을 의미
                if (board[i][move - 1] != 0) {
                
                    // 바구니에 값이 없으면 집어 올린 인형을 삽입
                    if (basket.size() == 0) {
                        basket.push(board[i][move - 1]);
                    } else {
                    
                        // 바구니에 값이 있으면, 가장 위의 값과 집어올린 값을 비교
                        // 같을 경우 터진 인형의 수 +2
                        if (basket.peek().equals(board[i][move - 1])) {
                            basket.pop();
                            answer += 2;
                        } else {
                            // 다를 경우 바구니에 집어 올린 값을 추가
                            basket.push(board[i][move - 1]);
                        }
                    
                    }
                
                    // 인형을 집어 올렸으므로 board에서 해당 값을 0으로 바꾸어
                    // 그 위치에 더이상 인형이 없다고 표시
                    board[i][move - 1] = 0;
                
                    // 해당 열에서 인형을 한 번만 집어 올려야 하기 때문에 break
                    break;
                }
            }
        }
        
        // 계산한 터진 인형의 개수를 반환
        return answer;
    }
}
