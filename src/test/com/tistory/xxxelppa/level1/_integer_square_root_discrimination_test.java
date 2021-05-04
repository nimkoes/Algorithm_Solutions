package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("정수 제곱근 판별")
class _integer_square_root_discrimination_test {
    
    @Builder
    @Getter
    static class TestCase {
        long n;
        
        long expected;
    }
    
    _integer_square_root_discrimination solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _integer_square_root_discrimination();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(121)
                        .expected(144)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(3)
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
