package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_060;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("합성수 찾기")
class Solution_060_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        int expected;
    }

    Solution_060 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_060();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(10)
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(15)
                .expected(8)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
