package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가운데 글자 가져오기")
class _get_the_middle_letter_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        String expected;
    }
    
    _get_the_middle_letter solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _get_the_middle_letter();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("abcde")
                        .expected("c")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("qwer")
                        .expected("we")
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
