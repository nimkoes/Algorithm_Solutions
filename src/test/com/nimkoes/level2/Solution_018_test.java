package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("조이스틱")
class Solution_018_test {

    @Builder
    @Getter
    static class TestCase {
        String name;

        int expected;
    }

    Solution_018 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_018();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .name("JEROEN")
                .expected(56)
                .build();

        assertThat(solution.solution(testCase.getName()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .name("JAN")
                .expected(23)
                .build();

        assertThat(solution.solution(testCase.getName()))
                .isEqualTo(testCase.getExpected());
    }
}
