package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_006;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("나머지 구하기")
class Solution_006_test {

    @Builder
    @Getter
    static class TestCase {
        int num1;
        int num2;
        int expected;
    }

    Solution_006 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_006();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num1(3)
                .num2(2)
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getNum1(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num1(10)
                .num2(5)
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getNum1(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }
}
