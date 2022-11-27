package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_040;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("숨어있는 숫자의 덧셈 (1)")
class Solution_040_test {

    @Builder
    @Getter
    static class TestCase {
        String my_string;
        int expected;
    }

    Solution_040 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_040();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("aAb1B2cC34oOp")
                .expected(10)
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("1a2b3c4d123")
                .expected(16)
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }
}
