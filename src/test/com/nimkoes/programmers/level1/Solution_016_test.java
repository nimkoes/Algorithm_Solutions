package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_016;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("내적")
class Solution_016_test {

    @Builder
    @Getter
    static class TestCase {
        int[] a;
        int[] b;

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
                .a(new int[]{1, 2, 3, 4})
                .b(new int[]{-3, -1, 0, 2})
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .a(new int[]{-1, 0, 1})
                .b(new int[]{1, 0, -1})
                .expected(-2)
                .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB()))
                .isEqualTo(testCase.getExpected());
    }
}
