package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("소수 찾기")
class _find_prime_numbers_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        
        int expected;
    }
    
    _find_prime_numbers solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _find_prime_numbers();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(10)
                        .expected(4)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(5)
                        .expected(3)
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
