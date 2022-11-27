package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("삼총사")
class Solution_054_test {

    @Builder
    @Getter
    static class TestCase {
        int[] number;

        int expected;
    }

    Solution_054 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_054();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .number(new int[]{-2, 3, 0, 2, -5})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getNumber()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .number(new int[]{-3, -2, -1, 0, 1, 2, 3})
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getNumber()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .number(new int[]{-1, 1, -1, 1})
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getNumber()))
                .isEqualTo(testCase.getExpected());
    }
}
