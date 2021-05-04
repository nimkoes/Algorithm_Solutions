package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("다트 게임")
class _darts_game_test {
    
    @Builder
    @Getter
    static class TestCase {
        String dartResult;
        
        int expected;
    }
    
    _darts_game solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _darts_game();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .dartResult("1S2D*3T")
                        .expected(37)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .dartResult("1D2S#10S")
                        .expected(9)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .dartResult("1D2S0T")
                        .expected(3)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .dartResult("1S*2T*3S")
                        .expected(23)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .dartResult("1D#2S*3S")
                        .expected(5)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .dartResult("1T2D3D#")
                        .expected(-4)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .dartResult("1D2S3T*")
                        .expected(59)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getDartResult()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
