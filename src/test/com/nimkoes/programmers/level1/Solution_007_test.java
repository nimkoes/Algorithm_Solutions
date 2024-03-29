package com.nimkoes.programmers.level1;

import com.nimkoes.programmers.level1.Solution_007;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내림차순으로 배치하기")
class Solution_007_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

        String expected;
    }

    Solution_007 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_007();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("Zbcdefg")
                .expected("gfedcbZ")
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }
}
