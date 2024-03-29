package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_041;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("폰켓몬")
class Solution_041_test {

    @Builder
    @Getter
    static class TestCase {
        int[] nums;

        int expected;
    }

    Solution_041 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_041();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{3, 1, 2, 3})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{3, 3, 3, 2, 2, 4})
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .nums(new int[]{3, 3, 3, 2, 2, 2})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getNums()))
                .isEqualTo(testCase.getExpected());
    }
}
