package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("땅따먹기")
class _ground_picking_test {

    @Builder
    @Getter
    static class TestCase {
        int[][] land;

        int expected;
    }

    _ground_picking solution;

    @BeforeEach
    void setUp() {
        solution = new _ground_picking();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .land(new int[][]{{1, 2, 3, 5}, {5, 6, 7, 8,}, {4, 3, 2, 1}})
                .expected(16)
                .build();

        assertThat(solution.solution(testCase.getLand()))
                .isEqualTo(testCase.getExpected());
    }
}
