package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("수박수박수박수박수박수?")
class _watermelon_watermelon_watermelon_watermelon_waterclap_test {

    @Builder
    @Getter
    static class TestCase {
        int n;

        String expected;
    }

    _watermelon_watermelon_watermelon_watermelon_waterclap solution;

    @BeforeEach
    void setUp() {
        solution = new _watermelon_watermelon_watermelon_watermelon_waterclap();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(3)
                .expected("수박수")
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(4)
                .expected("수박수박")
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
