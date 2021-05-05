package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("영어 끝말잇기")
class _english_ending_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        String[] words;
        
        int[] expected;
    }
    
    _english_ending solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _english_ending();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(3)
                        .words(new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})
                        .expected(new int[]{3, 3})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(5)
                        .words(new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})
                        .expected(new int[]{0, 0})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(2)
                        .words(new String[]{"hello", "one", "even", "never", "now", "world", "draw"})
                        .expected(new int[]{1, 3})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getN(), aCase.getWords()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}