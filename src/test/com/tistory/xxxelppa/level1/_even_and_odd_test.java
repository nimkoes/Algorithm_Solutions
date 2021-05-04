package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("짝수와 홀수")
class _even_and_odd_test {
    
    @Builder
    @Getter
    static class TestCase {
        int num;
        
        String expected;
    }
    
    _even_and_odd solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _even_and_odd();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .num(3)
                        .expected("Odd")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .num(4)
                        .expected("Even")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getNum()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
