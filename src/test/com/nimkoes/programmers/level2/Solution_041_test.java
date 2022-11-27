package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_041;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("올바른 괄호")
class Solution_041_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

        boolean expected;
    }

    Solution_041 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_041();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("()()")
                .expected(true)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.isExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("(())()")
                .expected(true)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.isExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s(")()(")
                .expected(false)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.isExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_04() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("(()(")
                .expected(false)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.isExpected());
    }
}
