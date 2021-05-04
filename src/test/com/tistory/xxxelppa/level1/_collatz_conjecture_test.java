package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("콜라츠 추측")
class _collatz_conjecture_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        
        int expected;
    }
    
    _collatz_conjecture solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _collatz_conjecture();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(6)
                        .expected(8)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(16)
                        .expected(4)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(626331)
                        .expected(-1)
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
