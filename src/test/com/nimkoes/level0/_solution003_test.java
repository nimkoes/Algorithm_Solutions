package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("두 수의 차")
class _solution003_test {

    @Builder
    @Getter
    static class TestCase {
        int num1;
        int num2;
        int expected;
    }

    Solution_003 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_003();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num1(2)
                .num2(3)
                .expected(-1)
                .build();

        assertThat(solution.solution(testCase.getNum1(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num1(100)
                .num2(2)
                .expected(98)
                .build();

        assertThat(solution.solution(testCase.getNum1(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }
}
