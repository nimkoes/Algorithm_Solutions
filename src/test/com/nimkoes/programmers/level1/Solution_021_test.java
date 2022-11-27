package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_021;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("나머지가 1이 되는 수 찾기")
class Solution_021_test {

    @Builder
    @Getter
    static class TestCase {
        int n;

        int expected;
    }

    Solution_021 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_021();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(10)
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(12)
                .expected(11)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
