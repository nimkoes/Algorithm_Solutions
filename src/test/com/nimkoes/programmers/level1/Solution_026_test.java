package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_026;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("체육복")
class Solution_026_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int[] lost;
        int[] reserve;

        int expected;
    }

    Solution_026 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_026();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(5)
                .lost(new int[]{2, 4})
                .reserve(new int[]{1, 3, 5})
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getLost(), testCase.getReserve()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(5)
                .lost(new int[]{2, 4})
                .reserve(new int[]{3})
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getLost(), testCase.getReserve()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(3)
                .lost(new int[]{3})
                .reserve(new int[]{1})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getLost(), testCase.getReserve()))
                .isEqualTo(testCase.getExpected());
    }
}
