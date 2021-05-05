package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 압축")
class _string_compression_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        int expected;
    }
    
    _string_compression solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _string_compression();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("aabbaccc")
                        .expected(7)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("ababcdcdababcdcd")
                        .expected(9)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("abcabcdede")
                        .expected(8)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("abcabcabcabcdededededede")
                        .expected(14)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("xababcdcdababcdcd")
                        .expected(17)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getS()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}