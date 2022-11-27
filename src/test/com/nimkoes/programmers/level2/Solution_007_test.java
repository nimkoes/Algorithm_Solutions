package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_007;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("124 나라의 숫자")
class Solution_007_test {

    @Builder
    @Getter
    static class TestCase {
        int n;

        String expected;
    }

    Solution_007 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_007();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void solution() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(1)
                .expected("1")
                .build();

        assertThat(solution.solution(testCase.n))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(2)
                .expected("2")
                .build();

        assertThat(solution.solution(testCase.n))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(3)
                .expected("4")
                .build();

        assertThat(solution.solution(testCase.n))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(4)
                .expected("11")
                .build();

        assertThat(solution.solution(testCase.n))
                .isEqualTo(testCase.getExpected());
    }
}
