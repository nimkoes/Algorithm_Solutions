package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("외계행성의 나이")
class Solution_054_test {

    @Builder
    @Getter
    static class TestCase {
        int age;
        String expected;
    }

    Solution_054 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_054();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .age(23)
                .expected("cd")
                .build();

        assertThat(solution.solution(testCase.getAge()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .age(51)
                .expected("fb")
                .build();

        assertThat(solution.solution(testCase.getAge()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .age(100)
                .expected("baa")
                .build();

        assertThat(solution.solution(testCase.getAge()))
                .isEqualTo(testCase.getExpected());
    }
}
