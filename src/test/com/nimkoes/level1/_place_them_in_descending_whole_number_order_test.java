package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("정수 내림차순으로 배치하기")
class _place_them_in_descending_whole_number_order_test {

    @Builder
    @Getter
    static class TestCase {
        long n;

        long expected;
    }

    _place_them_in_descending_whole_number_order solution;

    @BeforeEach
    void setUp() {
        solution = new _place_them_in_descending_whole_number_order();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(118372)
                .expected(873211)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}
