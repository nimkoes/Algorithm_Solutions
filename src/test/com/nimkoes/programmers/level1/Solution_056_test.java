package com.nimkoes.programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("크기가 작은 부분문자열")
class Solution_056_test {

    @Builder
    @Getter
    static class TestCase {
        String t;
        String p;

        int expected;
    }

    Solution_056 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_056();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .t("3141592")
                .p("271")
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getT(), testCase.getP()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .t("500220839878")
                .p("7")
                .expected(8)
                .build();

        assertThat(solution.solution(testCase.getT(), testCase.getP()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .t("10203")
                .p("15")
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getT(), testCase.getP()))
                .isEqualTo(testCase.getExpected());
    }
}
