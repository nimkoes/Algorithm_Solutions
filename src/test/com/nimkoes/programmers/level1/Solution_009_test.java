package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_009;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("예산")
class Solution_009_test {

    @Builder
    @Getter
    static class TestCase {
        int[] d;
        int budget;

        int expected;
    }

    Solution_009 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_009();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .d(new int[]{1, 3, 2, 5, 4})
                .budget(9)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getD(), testCase.getBudget()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .d(new int[]{2, 2, 3, 3})
                .budget(10)
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getD(), testCase.getBudget()))
                .isEqualTo(testCase.getExpected());
    }
}
