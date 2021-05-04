package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열을 정수로 바꾸기")
class _converting_a_string_to_an_integer_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        int expected;
    }
    
    _converting_a_string_to_an_integer solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _converting_a_string_to_an_integer();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("1234")
                        .expected(1234)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("-1234")
                        .expected(-1234)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getS()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
