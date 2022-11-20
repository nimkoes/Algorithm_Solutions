package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("실패율")
class Solution_019_test {

    @Builder
    @Getter
    static class TestCase {
        int N;
        int[] stage;

        int[] expected;
    }

    Solution_019 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_019();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .N(5)
                .stage(new int[]{2, 1, 2, 6, 2, 4, 3, 3})
                .expected(new int[]{3, 4, 2, 1, 5})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getStage()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void solution() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .N(4)
                .stage(new int[]{4, 4, 4, 4, 4})
                .expected(new int[]{4, 1, 2, 3})
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getStage()))
                .isEqualTo(testCase.getExpected());
    }
}
