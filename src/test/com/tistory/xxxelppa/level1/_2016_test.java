package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("2016년")
class _2016_test {

    @Builder
    @Getter
    static class TestCase {
        int a;
        int b;

        String expected;
    }

    _2016 solution;

    @BeforeEach
    void setUp() {
        solution = new _2016();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .a(5)
                .b(24)
                .expected("TUE")
                .build();

        assertThat(solution.solution(testCase.getA(), testCase.getB()))
                .isEqualTo(testCase.getExpected());
    }
}