package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("하샤드 수")
class _harshad_number_test {
    
    @Builder
    @Getter
    static class TestCase {
        int x;
        
        boolean expected;
    }
    
    _harshad_number solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _harshad_number();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .x(10)
                        .expected(true)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .x(12)
                        .expected(true)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .x(11)
                        .expected(false)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .x(13)
                        .expected(false)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getX()))
                    .isEqualTo(aCase.isExpected());
        }
    }
}
