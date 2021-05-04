package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("수박수박수박수박수박수?")
class _watermelon_watermelon_watermelon_watermelon_waterclap_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        
        String expected;
    }
    
    _watermelon_watermelon_watermelon_watermelon_waterclap solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _watermelon_watermelon_watermelon_watermelon_waterclap();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(3)
                        .expected("수박수")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(4)
                        .expected("수박수박")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getN()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
