package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_038;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("세균 증식")
class Solution_038_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int t;
        int expected;
    }

    Solution_038 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_038();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(2)
                .t(10)
                .expected(2048)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getT()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(7)
                .t(15)
                .expected(229376)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getT()))
                .isEqualTo(testCase.getExpected());
    }
}
