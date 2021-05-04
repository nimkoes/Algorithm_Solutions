package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("이상한 문자 만들기")
class _create_weird_characters_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        String expected;
    }
    
    _create_weird_characters solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _create_weird_characters();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("try hello world")
                        .expected("TrY HeLlO WoRlD")
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
