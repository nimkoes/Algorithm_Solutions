package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("멀쩡한 사각형")
class Solution_004_test {

    @Builder
    @Getter
    static class TestCase {
        int w;
        int h;

        long expected;
    }

    Solution_004 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_004();
    }

    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .w(8)
                .h(12)
                .expected(80L)
                .build();

        assertThat(solution.solution(testCase.getW(), testCase.getH()))
                .isEqualTo(testCase.getExpected());
    }
}
