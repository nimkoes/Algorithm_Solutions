package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("하샤드 수")
class _solution027_test {

    @Builder
    @Getter
    static class TestCase {
        int x;

        boolean expected;
    }

    Solution_027 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_027();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .x(10)
                .expected(true)
                .build();

        assertThat(solution.solution(testCase.getX()))
                .isEqualTo(testCase.isExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .x(12)
                .expected(true)
                .build();

        assertThat(solution.solution(testCase.getX()))
                .isEqualTo(testCase.isExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .x(11)
                .expected(false)
                .build();

        assertThat(solution.solution(testCase.getX()))
                .isEqualTo(testCase.isExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_04() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .x(13)
                .expected(false)
                .build();

        assertThat(solution.solution(testCase.getX()))
                .isEqualTo(testCase.isExpected());
    }
}
