package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("k의 개수")
class Solution_066_test {

    @Builder
    @Getter
    static class TestCase {
        int i;
        int j;
        int k;
        int expected;
    }

    Solution_066 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_066();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .i(1)
                .j(13)
                .k(1)
                .expected(6)
                .build();

        assertThat(solution.solution(testCase.getI(), testCase.getJ(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .i(10)
                .j(50)
                .k(5)
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getI(), testCase.getJ(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .i(3)
                .j(10)
                .k(2)
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getI(), testCase.getJ(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }
}
