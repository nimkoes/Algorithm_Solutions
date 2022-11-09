package com.nimkoes.level3;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("2 x n 타일링")
class _2n_tiling_test {

    @Builder
    @Getter
    static class TestCase {
        int n;

        int expected;
    }

    _2n_tiling solution;

    @BeforeEach
    void setUp() {
        solution = new _2n_tiling();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(4)
                .expected(5)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
