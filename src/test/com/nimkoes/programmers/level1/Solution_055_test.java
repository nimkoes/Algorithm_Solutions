package com.nimkoes.programmers.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가장 가까운 같은 글자")
class Solution_055_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

        int[] expected;
    }

    Solution_055 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_055();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("banana")
                .expected(new int[]{-1, -1, -1, 2, 2, 2})
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("foobar")
                .expected(new int[]{-1, -1, 1, -1, -1, -1})
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }
}
