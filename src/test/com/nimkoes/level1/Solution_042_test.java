package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("모의고사")
class Solution_042_test {

    @Builder
    @Getter
    static class TestCase {
        int[] answers;

        int[] expected;
    }

    Solution_042 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_042();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .answers(new int[]{1, 2, 3, 4, 5})
                .expected(new int[]{1})
                .build();

        assertThat(solution.solution(testCase.getAnswers()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .answers(new int[]{1, 3, 2, 4, 2})
                .expected(new int[]{1, 2, 3})
                .build();

        assertThat(solution.solution(testCase.getAnswers()))
                .isEqualTo(testCase.getExpected());
    }
}
