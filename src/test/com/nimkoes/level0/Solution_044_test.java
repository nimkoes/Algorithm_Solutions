package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가위 바위 보")
class Solution_044_test {

    @Builder
    @Getter
    static class TestCase {
        String rsp;
        String expected;
    }

    Solution_044 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_044();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .rsp("2")
                .expected("0")
                .build();

        assertThat(solution.solution(testCase.getRsp()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .rsp("205")
                .expected("052")
                .build();

        assertThat(solution.solution(testCase.getRsp()))
                .isEqualTo(testCase.getExpected());
    }
}
