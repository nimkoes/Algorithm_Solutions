package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_020;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 뒤집기")
class Solution_020_test {

    @Builder
    @Getter
    static class TestCase {
        String my_string;
        String expected;
    }

    Solution_020 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_020();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("jaron")
                .expected("noraj")
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("bread")
                .expected("daerb")
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }
}
