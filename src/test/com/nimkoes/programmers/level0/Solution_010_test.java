package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_010;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("짝수의 합")
class Solution_010_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int expected;
    }

    Solution_010 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_010();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(10)
                .expected(30)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(4)
                .expected(6)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
