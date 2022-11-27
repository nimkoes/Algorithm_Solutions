package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_094;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("OX퀴즈")
class Solution_094_test {

    @Builder
    @Getter
    static class TestCase {
        String[] quiz;
        String[] expected;
    }

    Solution_094 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_094();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .quiz(new String[]{"3 - 4 = -3", "5 + 6 = 11"})
                .expected(new String[]{"X", "O"})
                .build();

        assertThat(solution.solution(testCase.getQuiz()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .quiz(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})
                .expected(new String[]{"O", "O", "X", "O"})
                .build();

        assertThat(solution.solution(testCase.getQuiz()))
                .isEqualTo(testCase.getExpected());
    }
}
