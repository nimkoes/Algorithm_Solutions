package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("N진수 게임")
class _base_n_game_test {
    
    @Builder
    @Getter
    static class TestCase {
        int n;
        int t;
        int m;
        int p;
        
        String expected;
    }
    
    _base_n_game solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _base_n_game();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(2)
                        .t(4)
                        .m(2)
                        .p(1)
                        .expected("0111")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(16)
                        .t(16)
                        .m(2)
                        .p(1)
                        .expected("02468ACE11111111")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .n(16)
                        .t(16)
                        .m(2)
                        .p(2)
                        .expected("13579BDF01234567")
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getN(), aCase.getT(), aCase.getM(), aCase.getP()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}