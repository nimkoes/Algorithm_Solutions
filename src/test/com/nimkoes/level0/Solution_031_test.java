package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자 반복 출력하기")
class Solution_031_test {

    @Builder
    @Getter
    static class TestCase {
        String my_string;
        int n;
        String expected;
    }

    Solution_031 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_031();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .my_string("hello")
                .n(3)
                .expected("hhheeellllllooo")
                .build();

        assertThat(solution.solution(testCase.getMy_string(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
