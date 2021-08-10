package com.tistory.xxxelppa.weekly_challenge;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Week 002")
class Week_002_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[][] scores;
        
        String expected;
    }
    
    Week_002 solution;
    
    @BeforeEach
    void setUp() {
        solution = new Week_002();
    }
    
    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .scores(new int[][]{{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}})
                .expected("FBABD")
                .build();
        
        assertThat(solution.solution(testCase.getScores()))
                .isEqualTo(testCase.getExpected());
    }
    
    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .scores(new int[][]{{50, 90}, {50, 87}})
                .expected("DA")
                .build();
        
        assertThat(solution.solution(testCase.getScores()))
                .isEqualTo(testCase.getExpected());
    }
    
    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .scores(new int[][]{{70, 49, 90}, {68, 50, 38}, {73, 31, 100}})
                .expected("CFD")
                .build();
        
        assertThat(solution.solution(testCase.getScores()))
                .isEqualTo(testCase.getExpected());
    }
}
