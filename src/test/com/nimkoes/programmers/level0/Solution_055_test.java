package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_055;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("인덱스 바꾸기")
class Solution_055_test {

    @Builder
    @Getter
    static class TestCase {
        String my_string;
        int num1;
        int num2;
        String expected;
    }

    Solution_055 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_055();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("hello")
                .num1(1)
                .num2(2)
                .expected("hlelo")
                .build();

        assertThat(solution.solution(testCase.getMy_string(), testCase.getNum1(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("I love you")
                .num1(3)
                .num2(6)
                .expected("I l veoyou")
                .build();

        assertThat(solution.solution(testCase.getMy_string(), testCase.getNum1(), testCase.getNum2()))
                .isEqualTo(testCase.getExpected());
    }
}
