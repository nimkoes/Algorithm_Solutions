package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("다항식 더하기")
class Solution_095_test {

    @Builder
    @Getter
    static class TestCase {
        String polynomial;
        String expected;
    }

    Solution_095 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_095();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .polynomial("3x + 7 + x")
                .expected("4x + 7")
                .build();

        assertThat(solution.solution(testCase.getPolynomial()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .polynomial("x + x + x")
                .expected("3x")
                .build();

        assertThat(solution.solution(testCase.getPolynomial()))
                .isEqualTo(testCase.getExpected());
    }
}
