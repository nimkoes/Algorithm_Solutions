package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("프렌즈4블록")
class _friends_4_block_test {
    
    @Builder
    @Getter
    static class TestCase {
        int m;
        int n;
        String[] board;
        
        int expected;
    }
    
    _friends_4_block solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _friends_4_block();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .m(4)
                        .n(5)
                        .board(new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"})
                        .expected(14)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .m(6)
                        .n(6)
                        .board(new String[]{"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"})
                        .expected(15)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getM(), aCase.getN(), aCase.getBoard()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}