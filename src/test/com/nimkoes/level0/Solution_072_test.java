package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("공 던지기")
class Solution_072_test {

    @Builder
    @Getter
    static class TestCase {
        int[] numbers;
        int k;
        int expected;
    }

    Solution_072 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_072();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 2, 3, 4})
                .k(2)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getNumbers(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 2, 3, 4, 5, 6})
                .k(5)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getNumbers(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 2, 3})
                .k(3)
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getNumbers(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }
}
