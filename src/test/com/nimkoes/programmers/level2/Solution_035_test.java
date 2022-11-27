package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_035;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("쿼드압축 후 개수 세기")
class Solution_035_test {

    @Builder
    @Getter
    static class TestCase {
        int[][] arr;

        int[] expected;
    }

    Solution_035 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_035();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}})
                .expected(new int[]{4, 9})
                .build();

        assertThat(solution.solution(testCase.getArr()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[][]{{1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 1, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0, 0, 1}, {0, 0, 0, 0, 1, 1, 1, 1}})
                .expected(new int[]{10, 15})
                .build();

        assertThat(solution.solution(testCase.getArr()))
                .isEqualTo(testCase.getExpected());
    }
}
