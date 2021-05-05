package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("이진 변환 반복하기")
class _iterating_through_binary_transformation_test {
    
    @Builder
    @Getter
    static class TestCase {
        String s;
        
        int[] expected;
    }
    
    _iterating_through_binary_transformation solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _iterating_through_binary_transformation();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("110010101001")
                        .expected(new int[]{3, 8})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("01110")
                        .expected(new int[]{3, 3})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .s("1111111")
                        .expected(new int[]{4, 1})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getS()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}