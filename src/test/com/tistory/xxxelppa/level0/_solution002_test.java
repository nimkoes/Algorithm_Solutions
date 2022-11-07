package com.tistory.xxxelppa.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("두 수의 곱")
class _solution002_test {

    @Builder
    @Getter
    static class TestCase {
        int num1;
        int num2;
        int expected;
    }

    Solution_002 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_002();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num1(3)
                .num2(4)
                .expected(12)
                .build();

        assertThat(solution.solution(testCase.getNum1(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num1(27)
                .num2(19)
                .expected(513)
                .build();

        assertThat(solution.solution(testCase.getNum1(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }
}
