package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("JadenCase 문자열 만들기")
class _make_a_jadencase_string_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        String expected;
    }
    
    _make_a_jadencase_string solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _make_a_jadencase_string();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("3people unFollowed me")
                        .expected("3people Unfollowed Me")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("for the last week")
                        .expected("For The Last Week")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getS()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}