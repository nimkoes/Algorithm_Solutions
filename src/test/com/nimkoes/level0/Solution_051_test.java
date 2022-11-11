package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("주사위의 개수")
class Solution_051_test {

    @Builder
    @Getter
    static class TestCase {
        int[] box;
        int n;
        int expected;
    }

    Solution_051 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_051();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .box(new int[]{1, 1, 1})
                .n(1)
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getBox(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .box(new int[]{10, 8, 6})
                .n(3)
                .expected(12)
                .build();

        assertThat(solution.solution(testCase.getBox(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
