package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("배열 회전시키기")
class Solution_056_test {

    @Builder
    @Getter
    static class TestCase {
        int[] numbers;
        String direction;
        int[] expected;
    }

    Solution_056 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_056();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 2, 3})
                .direction("right")
                .expected(new int[]{3, 1, 2})
                .build();

        assertThat(solution.solution(testCase.getNumbers(), testCase.getDirection()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{4, 455, 6, 4, -1, 45, 6})
                .direction("left")
                .expected(new int[]{455, 6, 4, -1, 45, 6, 4})
                .build();

        assertThat(solution.solution(testCase.getNumbers(), testCase.getDirection()))
                .isEqualTo(testCase.getExpected());
    }
}
