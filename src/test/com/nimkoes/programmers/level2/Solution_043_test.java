package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_043;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("다음 큰 숫자")
class Solution_043_test {

    @Builder
    @Getter
    static class TestCase {
        int n;

        int expected;
    }

    Solution_043 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_043();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(78)
                .expected(83)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(15)
                .expected(23)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
