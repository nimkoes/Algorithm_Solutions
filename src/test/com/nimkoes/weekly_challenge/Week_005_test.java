package com.nimkoes.weekly_challenge;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Week 005")
class Week_005_test {
    
    @Builder
    @Getter
    static class TestCase {
        String word;
        
        int expected;
    }
    
    Week_005 solution;
    
    @BeforeEach
    void setUp() {
        solution = new Week_005();
    }
    
    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .word("AAAAE")
                .expected(6)
                .build();
        
        assertThat(solution.solution(testCase.getWord()))
                .isEqualTo(testCase.getExpected());
    }
    
    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .word("AAAE")
                .expected(10)
                .build();
        
        assertThat(solution.solution(testCase.getWord()))
                .isEqualTo(testCase.getExpected());
    }
    
    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .word("I")
                .expected(1563)
                .build();
        
        assertThat(solution.solution(testCase.getWord()))
                .isEqualTo(testCase.getExpected());
    }
    
    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_04() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .word("EIO")
                .expected(1189)
                .build();
        
        assertThat(solution.solution(testCase.getWord()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 5")
    void test_05() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .word("EEEEE")
                .expected(980)
                .build();

        assertThat(solution.solution(testCase.getWord()))
                .isEqualTo(testCase.getExpected());
    }

}
