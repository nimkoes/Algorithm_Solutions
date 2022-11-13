package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("7의 개수")
class Solution_067_test {

    @Builder
    @Getter
    static class TestCase {
        int[] array;
        int expected;
    }

    Solution_067 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_067();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{7, 77, 17})
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getArray()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{10, 29})
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getArray()))
                .isEqualTo(testCase.getExpected());
    }
}
