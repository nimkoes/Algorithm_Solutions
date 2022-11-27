package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_026;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("배열 자르기")
class Solution_026_test {

    @Builder
    @Getter
    static class TestCase {
        int[] numbers;
        int num1;
        int num2;
        int[] expected;
    }

    Solution_026 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_026();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 2, 3, 4, 5})
                .num1(1)
                .num2(3)
                .expected(new int[]{2, 3, 4})
                .build();

        assertThat(solution.solution(testCase.getNumbers(), testCase.getNum1(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 3, 5})
                .num1(1)
                .num2(2)
                .expected(new int[]{3, 5})
                .build();

        assertThat(solution.solution(testCase.getNumbers(), testCase.getNum1(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }
}
