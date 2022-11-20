package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("나누어 떨어지는 숫자 배열")
class _solution006_test {

    @Builder
    @Getter
    static class TestCase {
        int[] arr;
        int divisor;

        int[] expected;
    }

    Solution_006 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_006();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[]{5, 9, 7, 10})
                .divisor(5)
                .expected(new int[]{5, 10})
                .build();

        assertThat(solution.solution(testCase.getArr(), testCase.getDivisor()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[]{2, 36, 1, 3})
                .divisor(1)
                .expected(new int[]{1, 2, 3, 36})
                .build();

        assertThat(solution.solution(testCase.getArr(), testCase.getDivisor()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[]{3, 2, 6})
                .divisor(10)
                .expected(new int[]{-1})
                .build();

        assertThat(solution.solution(testCase.getArr(), testCase.getDivisor()))
                .isEqualTo(testCase.getExpected());
    }
}
