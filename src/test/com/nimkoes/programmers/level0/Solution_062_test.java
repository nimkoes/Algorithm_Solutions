package com.nimkoes.programmers.level0;

import com.nimkoes.programmers.level0.Solution_062;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("중복된 문자 제거")
class Solution_062_test {

    @Builder
    @Getter
    static class TestCase {
        String my_string;
        String expected;
    }

    Solution_062 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_062();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("people")
                .expected("peol")
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("We are the world")
                .expected("We arthwold")
                .build();

        assertThat(solution.solution(testCase.getMy_string()))
                .isEqualTo(testCase.getExpected());
    }
}
