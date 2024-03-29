package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_024;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("큰 수 만들기")
class Solution_024_test {

    @Builder
    @Getter
    static class TestCase {
        String number;
        int k;

        String expected;
    }

    Solution_024 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_024();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .number("1924")
                .k(2)
                .expected("94")
                .build();

        assertThat(solution.solution(testCase.getNumber(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .number("1231234")
                .k(3)
                .expected("3234")
                .build();

        assertThat(solution.solution(testCase.getNumber(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .number("4177252841")
                .k(4)
                .expected("775841")
                .build();

        assertThat(solution.solution(testCase.getNumber(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }
}
