package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("양꼬치")
class Solution_012_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int k;
        int expected;
    }

    Solution_012 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_012();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(10)
                .k(3)
                .expected(124000)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(64)
                .k(6)
                .expected(768000)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }
}
