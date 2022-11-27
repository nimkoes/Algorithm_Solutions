package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_031;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("K번째수")
class Solution_031_test {

    @Builder
    @Getter
    static class TestCase {
        int[] array;
        int[][] commands;

        int[] expected;
    }

    Solution_031 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_031();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{1, 5, 2, 6, 3, 7, 4})
                .commands(new int[][]{
                        {2, 5, 3},
                        {4, 4, 1},
                        {1, 7, 3}
                })
                .expected(new int[]{5, 6, 3})
                .build();

        assertThat(solution.solution(testCase.getArray(), testCase.getCommands()))
                .isEqualTo(testCase.getExpected());
    }
}
