package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_077;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("종이 자르기")
class Solution_077_test {

    @Builder
    @Getter
    static class TestCase {
        int M;
        int N;
        int expected;
    }

    Solution_077 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_077();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .M(2)
                .N(2)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getM(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .M(2)
                .N(5)
                .expected(9)
                .build();

        assertThat(solution.solution(testCase.getM(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .M(1)
                .N(1)
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getM(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
