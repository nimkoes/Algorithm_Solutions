package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내림차순으로 배치하기")
class _arrange_the_strings_in_descending_order_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        String expected;
    }
    
    _arrange_the_strings_in_descending_order solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _arrange_the_strings_in_descending_order();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("Zbcdefg")
                        .expected("gfedcbZ")
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
