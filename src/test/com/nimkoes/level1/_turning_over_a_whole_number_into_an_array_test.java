package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("자연수 뒤집어 배열로 만들기")
class _turning_over_a_whole_number_into_an_array_test {

    @Builder
    @Getter
    static class TestCase {
        long n;

        int[] expected;
    }

    _turning_over_a_whole_number_into_an_array solution;

    @BeforeEach
    void setUp() {
        solution = new _turning_over_a_whole_number_into_an_array();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(12345)
                .expected(new int[]{5, 4, 3, 2, 1})
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
