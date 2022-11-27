package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_097;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("연속된 수의 합")
class Solution_097_test {

    @Builder
    @Getter
    static class TestCase {
        int num;
        int total;
        int[] expected;
    }

    Solution_097 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_097();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num(3)
                .total(12)
                .expected(new int[]{3, 4, 5})
                .build();

        assertThat(solution.solution(testCase.getNum(), testCase.getTotal()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num(5)
                .total(15)
                .expected(new int[]{1, 2, 3, 4, 5})
                .build();

        assertThat(solution.solution(testCase.getNum(), testCase.getTotal()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num(4)
                .total(14)
                .expected(new int[]{2, 3, 4, 5})
                .build();

        assertThat(solution.solution(testCase.getNum(), testCase.getTotal()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_04() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num(5)
                .total(5)
                .expected(new int[]{-1, 0, 1, 2, 3})
                .build();

        assertThat(solution.solution(testCase.getNum(), testCase.getTotal()))
                .isEqualTo(testCase.getExpected());
    }
}
