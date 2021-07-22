package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("프린터")
class _printer_test {

    @Builder
    @Getter
    static class TestCase {
        int[] priorities;
        int location;

        int expected;
    }

    _printer solution;

    @BeforeEach
    void setUp() {
        solution = new _printer();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .priorities(new int[]{2, 1, 3, 2})
                .location(2)
                .expected(1)
                .build();

        assertThat(solution.solution(testCase.getPriorities(), testCase.getLocation()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .priorities(new int[]{1, 1, 9, 1, 1, 1})
                .location(0)
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getPriorities(), testCase.getLocation()))
                .isEqualTo(testCase.getExpected());
    }
}