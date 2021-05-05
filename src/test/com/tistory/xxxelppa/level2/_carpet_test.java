package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("카펫")
class _carpet_test {
    
    @Builder
    @Getter
    static class TestCase {
        int brown;
        int yellow;
        
        int[] expected;
    }
    
    _carpet solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _carpet();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .brown(10)
                        .yellow(2)
                        .expected(new int[]{4, 3})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .brown(8)
                        .yellow(1)
                        .expected(new int[]{3, 3})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .brown(24)
                        .yellow(24)
                        .expected(new int[]{8, 6})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getBrown(), aCase.getYellow()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}