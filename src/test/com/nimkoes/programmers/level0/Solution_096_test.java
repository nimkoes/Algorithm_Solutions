package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_096;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("분수의 덧셈")
class Solution_096_test {

    @Builder
    @Getter
    static class TestCase {
        int denum1;
        int num1;
        int denum2;
        int num2;
        int[] expected;
    }

    Solution_096 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_096();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .denum1(1)
                .num1(2)
                .denum2(3)
                .num2(4)
                .expected(new int[]{5, 4})
                .build();

        assertThat(solution.solution(testCase.getDenum1(), testCase.getNum1(), testCase.getDenum2(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .denum1(9)
                .num1(2)
                .denum2(1)
                .num2(3)
                .expected(new int[]{29, 6})
                .build();

        assertThat(solution.solution(testCase.getDenum1(), testCase.getNum1(), testCase.getDenum2(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }
}
