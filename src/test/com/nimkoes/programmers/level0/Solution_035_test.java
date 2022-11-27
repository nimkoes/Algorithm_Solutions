package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_035;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("짝수는 싫어요")
class Solution_035_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int[] expected;
    }

    Solution_035 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_035();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(10)
                .expected(new int[]{1, 3, 5, 7, 9})
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(15)
                .expected(new int[]{1, 3, 5, 7, 9, 11, 13, 15})
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
