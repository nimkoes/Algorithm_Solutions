package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_014;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가장 큰 수")
class Solution_014_test {

    @Builder
    @Getter
    static class TestCase {
        int[] numbers;

        String expected;
    }

    Solution_014 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_014();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{6, 10, 2})
                .expected("6210")
                .build();

        assertThat(solution.solution((testCase.getNumbers())))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{3, 30, 34, 5, 9})
                .expected("9534330")
                .build();

        assertThat(solution.solution((testCase.getNumbers())))
                .isEqualTo(testCase.getExpected());
    }
}
