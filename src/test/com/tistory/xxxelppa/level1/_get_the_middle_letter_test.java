package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가운데 글자 가져오기")
class _get_the_middle_letter_test {

    @Builder
    @Getter
    static class TestCase {
        String s;

        String expected;
    }

    _get_the_middle_letter solution;

    @BeforeEach
    void setUp() {
        solution = new _get_the_middle_letter();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("abcde")
                .expected("c")
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .s("qwer")
                .expected("we")
                .build();

        assertThat(solution.solution(testCase.getS()))
                .isEqualTo(testCase.getExpected());
    }
}
