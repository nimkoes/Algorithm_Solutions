package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("H-Index")
class Solution_022_test {

    @Builder
    @Getter
    static class TestCase {
        int[] citations;

        int expected;
    }

    Solution_022 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_022();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .citations(new int[]{3, 0, 6, 1, 5})
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getCitations()))
                .isEqualTo(testCase.getExpected());
    }
}
