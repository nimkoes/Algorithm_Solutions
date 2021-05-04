package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열 내 마음대로 정렬하기")
class _sort_strings_at_will_test {
    
    @Builder
    @Getter
    static class TestCase {
        String[] strings;
        int n;
        
        String[] expected;
    }
    
    _sort_strings_at_will solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _sort_strings_at_will();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .strings(new String[]{"sun", "bed", "car"})
                        .n(1)
                        .expected(new String[]{"car", "bed", "sun"})
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .strings(new String[]{"abce", "abcd", "cdx"})
                        .n(2)
                        .expected(new String[]{"abcd", "abce", "cdx"})
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getStrings(), aCase.getN()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}
