package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_036;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("자릿수 더하기")
class Solution_036_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int expected;
    }

    Solution_036 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_036();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(1234)
                .expected(10)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(930211)
                .expected(16)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
