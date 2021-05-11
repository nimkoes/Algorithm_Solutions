package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("시저 암호")
class _caesar_password_test {

    @Builder
    @Getter
    static class TestCase {
        String s;
        int n;

        String expected;
    }

    _caesar_password solution;

    @BeforeEach
    void setUp() {
        solution = new _caesar_password();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("AB")
                .n(1)
                .expected("BC")
                .build();

        assertThat(solution.solution(testCase.getS(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("z")
                .n(1)
                .expected("a")
                .build();

        assertThat(solution.solution(testCase.getS(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("a B z")
                .n(4)
                .expected("e F d")
                .build();

        assertThat(solution.solution(testCase.getS(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
