package com.tistory.xxxelppa.level1;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.Builder;
import lombok.Getter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


@DisplayName("크레인 인형뽑기 게임")
class _crane_doll_draw_game_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[][] board;
        int[] moves;
        
        int expected;
    }
    
    _crane_doll_draw_game solution;
    ArrayList<TestCase> testCase;
    
    
    @BeforeEach
    void setUp() {
        solution = new _crane_doll_draw_game();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .board(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}})
                        .moves(new int[]{1, 5, 3, 5, 1, 2, 1, 4})
                        .expected(4)
                        .build()
        );
    }
    
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getBoard(), aCase.getMoves())).isEqualTo(aCase.getExpected());
        }
    }
    
}
