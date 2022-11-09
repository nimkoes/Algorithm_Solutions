package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 다루기 기본")
class _basics_of_handling_strings_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

        boolean expected;
    }

    _basics_of_handling_strings solution;

    @BeforeEach
    void setUp() {
        solution = new _basics_of_handling_strings();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("a234")
                .expected(false)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.isExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("1234")
                .expected(true)
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.isExpected());
    }
}
