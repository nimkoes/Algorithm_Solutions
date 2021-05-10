package com.tistory.xxxelppa.level3;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
    ArrayList<TestCase> testCase;


    @BeforeEach
    void setUp() {
        testCase = new ArrayList<>();

        testCase.add(
                new TestCase.TestCaseBuilder()
                        .begin("hit")
                        .target("cog")
                        .words(new String[]{"hot", "dot", "dog", "lot", "log", "cog"})
                        .expected(4)
                        .build()
        );

        testCase.add(
                new TestCase.TestCaseBuilder()
                        .begin("hit")
                        .target("cog")
                        .words(new String[]{"hot", "dot", "dog", "lot", "log"})
                        .expected(0)
                        .build()
        );
    }

    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            solution = new _word_conversion();
            assertThat(solution.solution(aCase.getBegin(), aCase.getTarget(), aCase.getWords()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
