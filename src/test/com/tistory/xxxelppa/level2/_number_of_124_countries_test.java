package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("124 나라의 숫자")
class _number_of_124_countries_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        
        String expected;
    }
    
    _number_of_124_countries solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _number_of_124_countries();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(1)
                        .expected("1")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(2)
                        .expected("2")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(3)
                        .expected("4")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(4)
                        .expected("11")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.n))
                    .isEqualTo(aCase.getExpected());
        }
    }
}