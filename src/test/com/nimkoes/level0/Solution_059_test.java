package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("369게임")
class Solution_059_test {

    @Builder
    @Getter
    static class TestCase {
        int order;
        int expected;
    }

    Solution_059 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_059();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .order(3)
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getOrder()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .order(29423)
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getOrder()))
                .isEqualTo(testCase.getExpected());
    }
}
