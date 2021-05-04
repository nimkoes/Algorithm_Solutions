package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내 p와 y의 개수")
class _the_number_of_p_and_y_in_the_string_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        boolean expected;
    }
    
    _the_number_of_p_and_y_in_the_string solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _the_number_of_p_and_y_in_the_string();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("pPoooyY")
                        .expected(true)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("Pyy")
                        .expected(false)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getS()))
                    .isEqualTo(aCase.isExpected());
        }
    }
}
