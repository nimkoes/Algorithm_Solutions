package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("큰 수 만들기")
class _making_a_big_number_test {
    
    @Builder
    @Getter
    static class TestCase {
        String number;
        int k;
        
        String expected;
    }
    
    _making_a_big_number solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _making_a_big_number();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .number("1924")
                        .k(2)
                        .expected("94")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .number("1231234")
                        .k(3)
                        .expected("3234")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .number("4177252841")
                        .k(4)
                        .expected("775841")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getNumber(), aCase.getK()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}