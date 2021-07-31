package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("H-Index")
class _h_index_test {

    @Builder
    @Getter
    static class TestCase {
        int[] citations;

        int expected;
    }

    _h_index solution;

    @BeforeEach
    void setUp() {
        solution = new _h_index();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .citations(new int[]{3, 0, 6, 1, 5})
                .expected(3)
                .build();

        assertThat(solution.solution(testCase.getCitations()))
                .isEqualTo(testCase.getExpected());
    }
}
