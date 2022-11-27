package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_045;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("숫자의 표현")
class Solution_045_test {

    @Builder
    @Getter
    static class TestCase {
        int n;

        int expected;
    }

    Solution_045 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_045();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(15)
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
