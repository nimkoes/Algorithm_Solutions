package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("자릿수 더하기")
class _add_the_number_of_digits_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        
        int expected;
    }
    
    _add_the_number_of_digits solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _add_the_number_of_digits();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(123)
                        .expected(6)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(987)
                        .expected(24)
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
