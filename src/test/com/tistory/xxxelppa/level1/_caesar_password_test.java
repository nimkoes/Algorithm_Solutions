package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("시저 암호")
class _caesar_password_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        int n;
        
        String expected;
    }
    
    _caesar_password solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _caesar_password();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("AB")
                        .n(1)
                        .expected("BC")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("z")
                        .n(1)
                        .expected("a")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("a B z")
                        .n(4)
                        .expected("e F d")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getS(), aCase.getN()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
