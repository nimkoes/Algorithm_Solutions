package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_003;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("짝지어 제거하기")
class Solution_003_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

        int expected;
    }

    Solution_003 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_003();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("baabaa")
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("cdcd")
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }
}
