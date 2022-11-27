package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_016;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("예상 대진표")
class Solution_016_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int a;
        int b;

        int expected;
    }

    Solution_016 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_016();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(8)
                .a(4)
                .b(7)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getA(), testCase.getB()))
                .isEqualTo(testCase.getExpected());
    }
}
