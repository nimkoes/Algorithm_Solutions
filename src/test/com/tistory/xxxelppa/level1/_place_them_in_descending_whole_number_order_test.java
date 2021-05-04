package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("정수 내림차순으로 배치하기")
class _place_them_in_descending_whole_number_order_test {
    
    @Builder
    @Getter
    static class TestCase {
        long n;
        
        long expected;
    }
    
    _place_them_in_descending_whole_number_order solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _place_them_in_descending_whole_number_order();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(118372)
                        .expected(873211)
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
