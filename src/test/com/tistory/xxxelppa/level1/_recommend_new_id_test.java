package com.tistory.xxxelppa.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("신규 아이디 추천")
class _recommend_new_id_test {
    
    @Builder
    @Getter
    static class TestCase {
        String new_id;
        
        String expected;
    }
    
    _recommend_new_id solution;
    ArrayList<TestCase> testCase;
    
    
    @BeforeEach
    void setUp() {
        solution = new _recommend_new_id();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .new_id("...!@BaT#*..y.abcdefghijklm")
                        .expected("bat.y.abcdefghi")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .new_id("z-+.^.")
                        .expected("z--")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .new_id("=.=")
                        .expected("aaa")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .new_id("123_.def")
                        .expected("123_.def")
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .new_id("abcdefghijklmn.p")
                        .expected("abcdefghijklmn")
                        .build()
        );
        
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getNew_id()))
                    .isEqualTo(aCase.getExpected());
        }
    }
}