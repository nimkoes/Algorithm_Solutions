package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("배열의 유사도")
class Solution_033_test {

    @Builder
    @Getter
    static class TestCase {
        String[] s1;
        String[] s2;
        int expected;
    }

    Solution_033 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_033();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s1(new String[]{"a", "b", "c"})
                .s2(new String[]{"com", "b", "d", "p", "c"})
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getS1(), testCase.getS2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s1(new String[]{"n", "omg"})
                .s2(new String[]{"m", "dot"})
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getS1(), testCase.getS2()))
                .isEqualTo(testCase.getExpected());
    }
}
