package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("x만큼 간격이 있는 n개의 숫자")
class _solution036_test {

    @Builder
    @Getter
    static class TestCase {
        long x;
        int n;

        long[] expected;
    }

    Solution_036 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_036();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .x(2)
                .n(5)
                .expected(new long[]{2, 4, 6, 8, 10})
                .build();

        assertThat(solution.solution(testCase.getX(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .x(4)
                .n(3)
                .expected(new long[]{4, 8, 12})
                .build();

        assertThat(solution.solution(testCase.getX(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .x(-4)
                .n(2)
                .expected(new long[]{-4, -8})
                .build();

        assertThat(solution.solution(testCase.getX(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
