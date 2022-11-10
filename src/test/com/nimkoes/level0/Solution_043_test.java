package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("중앙값 구하기")
class Solution_043_test {

    @Builder
    @Getter
    static class TestCase {
        int[] array;
        int expected;
    }

    Solution_043 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_043();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{1, 2, 7, 10, 11})
                .expected(7)
                .build();

        assertThat(solution.solution(testCase.getArray()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{9, -1, 0})
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getArray()))
                .isEqualTo(testCase.getExpected());
    }
}
