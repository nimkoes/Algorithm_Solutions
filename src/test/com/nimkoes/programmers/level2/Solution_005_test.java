package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_005;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("타겟 넘버")
class Solution_005_test {

    @Builder
    @Getter
    static class TestCase {
        int[] numbers;
        int target;

        int expected;
    }

    Solution_005 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_005();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .numbers(new int[]{1, 1, 1, 1, 1})
                .target(3)
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getNumbers(), testCase.getTarget()))
                .isEqualTo(testCase.getExpected());
    }
}
