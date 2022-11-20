package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("평균 구하기")
class Solution_023_test {

    @Builder
    @Getter
    static class TestCase {
        int[] arr;

        double expected;
    }

    Solution_023 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_023();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[]{1, 2, 3, 4})
                .expected(2.5)
                .build();

        assertThat(solution.solution(testCase.getArr()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[]{5, 5})
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getArr()))
                .isEqualTo(testCase.getExpected());
    }
}
