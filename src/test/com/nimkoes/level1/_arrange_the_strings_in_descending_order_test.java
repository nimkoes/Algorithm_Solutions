package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내림차순으로 배치하기")
class _arrange_the_strings_in_descending_order_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

        String expected;
    }

    _arrange_the_strings_in_descending_order solution;

    @BeforeEach
    void setUp() {
        solution = new _arrange_the_strings_in_descending_order();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("Zbcdefg")
                .expected("gfedcbZ")
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }
}
