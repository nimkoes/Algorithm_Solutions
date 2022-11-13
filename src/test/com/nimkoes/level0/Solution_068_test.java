package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가까운 수")
class Solution_068_test {

    @Builder
    @Getter
    static class TestCase {
        int[] array;
        int n;
        int expected;
    }

    Solution_068 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_068();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{3, 10, 28})
                .n(20)
                .expected(28)
                .build();

        assertThat(solution.solution(testCase.getArray(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{10, 11, 12})
                .n(13)
                .expected(12)
                .build();

        assertThat(solution.solution(testCase.getArray(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
