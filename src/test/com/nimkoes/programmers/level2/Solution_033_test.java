package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_033;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("이진 변환 반복하기")
class Solution_033_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

        int[] expected;
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
                .s("110010101001")
                .expected(new int[]{3, 8})
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("01110")
                .expected(new int[]{3, 3})
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("1111111")
                .expected(new int[]{4, 1})
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }
}
