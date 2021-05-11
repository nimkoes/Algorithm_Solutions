package com.tistory.xxxelppa.level3;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("단어 변환")
class _word_conversion_test {

    @Builder
    @Getter
    static class TestCase {
        String begin;
        String target;
        String[] words;

        int expected;
    }

    _word_conversion solution;

    @BeforeEach
    void setUp() {
        solution = new _word_conversion();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .begin("hit")
                .target("cog")
                .words(new String[]{"hot", "dot", "dog", "lot", "log", "cog"})
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getBegin(), testCase.getTarget(), testCase.getWords()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .begin("hit")
                .target("cog")
                .words(new String[]{"hot", "dot", "dog", "lot", "log"})
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getBegin(), testCase.getTarget(), testCase.getWords()))
                .isEqualTo(testCase.getExpected());
    }
}
