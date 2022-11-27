package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_053;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("숫자 찾기")
class Solution_053_test {

    @Builder
    @Getter
    static class TestCase {
        int num;
        int k;
        int expected;
    }

    Solution_053 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_053();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num(29183)
                .k(1)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getNum(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num(232443)
                .k(4)
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getNum(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .num(123456)
                .k(7)
                .expected(-1)
                .build();

        assertThat(solution.solution(testCase.getNum(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }
}
