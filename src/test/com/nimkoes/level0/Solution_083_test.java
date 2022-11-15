package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("직사각형 넓이 구하기")
class Solution_083_test {

    @Builder
    @Getter
    static class TestCase {
        int[][] dots;
        int expected;
    }

    Solution_083 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_083();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dots(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}})
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getDots()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .dots(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}})
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getDots()))
                .isEqualTo(testCase.getExpected());
    }
}
