package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("뉴스 클러스터링")
class _news_clustering_test {
    
    @Builder
    @Getter
    static class TestCase {
        String str1;
        String str2;
        
        int expected;
    }
    
    _news_clustering solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _news_clustering();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .str1("FRANCE")
                        .str2("french")
                        .expected(16384)
                        .build()
        );
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .str1("handshake")
                        .str2("shake hands")
                        .expected(65536)
                        .build()
        );
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .str1("aa1+aa2")
                        .str2("AAAA12")
                        .expected(43690)
                        .build()
        );
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .str1("E=M*C^2")
                        .str2("e=m*c^2")
                        .expected(65536)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getStr1(), aCase.getStr2()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}