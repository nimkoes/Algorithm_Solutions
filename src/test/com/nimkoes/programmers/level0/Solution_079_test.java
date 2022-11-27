package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_079;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 계산하기")
class Solution_079_test {

    @Builder
    @Getter
    static class TestCase {
        String my_string;
        int expected;
    }

    Solution_079 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_079();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("3 + 4")
                .expected(7)
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }
}
