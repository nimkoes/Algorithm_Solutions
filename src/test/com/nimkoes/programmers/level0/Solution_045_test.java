package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_045;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("n의 배수 고르기")
class Solution_045_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int[] numlist;
        int[] expected;
    }

    Solution_045 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_045();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(3)
                .numlist(new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})
                .expected(new int[]{6, 9, 12})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getNumlist()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(5)
                .numlist(new int[]{1, 9, 3, 10, 13, 5})
                .expected(new int[]{10, 5})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getNumlist()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(12)
                .numlist(new int[]{2, 100, 120, 600, 12, 12})
                .expected(new int[]{120, 600, 12, 12})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getNumlist()))
                .isEqualTo(testCase.getExpected());
    }
}
