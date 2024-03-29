package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_006;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("더 맵게")
class Solution_006_test {

    @Builder
    @Getter
    static class TestCase {
        int[] scoville;
        int K;

        int expected;
    }

    Solution_006 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_006();
    }

    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .scoville(new int[]{1, 2, 3, 9, 10, 12})
                .K(7)
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getScoville(), testCase.getK()))
                .isEqualTo(testCase.getExpected());
    }
}
