package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("이진수 더하기")
class Solution_070_test {

    @Builder
    @Getter
    static class TestCase {
        String bin1;
        String bin2;
        String expected;
    }

    Solution_070 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_070();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .bin1("10")
                .bin2("11")
                .expected("101")
                .build();

        assertThat(solution.solution(testCase.getBin1(), testCase.getBin2()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .bin1("1001")
                .bin2("1111")
                .expected("11000")
                .build();

        assertThat(solution.solution(testCase.getBin1(), testCase.getBin2()))
                .isEqualTo(testCase.getExpected());
    }
}
