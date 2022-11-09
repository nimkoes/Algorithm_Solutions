package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("제일 작은 수 제거하기")
class _remove_the_smallest_number_test {

    @Builder
    @Getter
    static class TestCase {
        int[] arr;

        int[] expected;
    }

    _remove_the_smallest_number solution;

    @BeforeEach
    void setUp() {
        solution = new _remove_the_smallest_number();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[]{4, 3, 2, 1})
                .expected(new int[]{4, 3, 2})
                .build();

        assertThat(solution.solution(testCase.getArr()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .arr(new int[]{10})
                .expected(new int[]{-1})
                .build();

        assertThat(solution.solution(testCase.getArr()))
                .isEqualTo(testCase.getExpected());
    }
}
