package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("중복된 숫자 개수")
class _solution016_test {

    @Builder
    @Getter
    static class TestCase {
        int[] array;
        int n;
        int expected;
    }

    Solution_016 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_016();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{1, 1, 2, 3, 4, 5})
                .n(1)
                .expected(2)
                .build();

        assertThat(solution.solution(testCase.getArray(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .array(new int[]{0, 2, 3, 4})
                .n(1)
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getArray(), testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
