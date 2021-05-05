package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("조이스틱")
class _joystick_test {
    
    @Builder
    @Getter
    static class TestCase {
        String name;
        
        int expected;
    }
    
    _joystick solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _joystick();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .name("JEROEN")
                        .expected(56)
                        .build()
        );
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .name("JAN")
                        .expected(23)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getName()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}