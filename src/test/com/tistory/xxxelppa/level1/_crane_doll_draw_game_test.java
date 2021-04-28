package com.tistory.xxxelppa.level1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("크레인 인형뽑기 게임")
class _crane_doll_draw_game_test {
    
    _crane_doll_draw_game solution;
    
    @BeforeEach
    void setUp() {
        solution = new _crane_doll_draw_game();
    }
    
    @Test
    @DisplayName("테스트 케이스 1")
    void solution() {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
    
        assertThat(solution.solution(board, moves)).isEqualTo(4);
    }
    
}
