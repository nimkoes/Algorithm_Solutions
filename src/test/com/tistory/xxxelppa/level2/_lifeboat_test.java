package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("구명보트")
class _lifeboat_test {
    
    @Builder
    @Getter
    static class TestCase {
        int[] people;
        int limit;
        
        int expected;
    }
    
    _lifeboat solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _lifeboat();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .people(new int[]{70, 50, 80, 50})
                        .limit(100)
                        .expected(3)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .people(new int[]{70, 80, 50})
                        .limit(100)
                        .expected(3)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getPeople(), aCase.getLimit()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}