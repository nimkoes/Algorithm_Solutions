package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 다루기 기본")
class _basics_of_handling_strings_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        boolean expected;
    }
    
    _basics_of_handling_strings solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _basics_of_handling_strings();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("a234")
                        .expected(false)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("1234")
                        .expected(true)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getS()))
                    .isEqualTo(aCase.isExpected());
        }
    }
}
