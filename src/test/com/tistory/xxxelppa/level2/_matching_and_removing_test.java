package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("짝지어 제거하기")
class _matching_and_removing_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        int expected;
    }
    
    _matching_and_removing solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _matching_and_removing();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("baabaa")
                        .expected(1)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("cdcd")
                        .expected(0)
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