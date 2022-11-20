package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내 마음대로 정렬하기")
class Solution_048_test {

    @Builder
    @Getter
    static class TestCase {
        String[] strings;
        int n;

        String[] expected;
    }

    Solution_048 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_048();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .strings(new String[]{"sun", "bed", "car"})
                .n(1)
                .expected(new String[]{"car", "bed", "sun"})
                .build();

        assertThat(solution.solution(testCase.getStrings(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .strings(new String[]{"abce", "abcd", "cdx"})
                .n(2)
                .expected(new String[]{"abcd", "abce", "cdx"})
                .build();

        assertThat(solution.solution(testCase.getStrings(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
