package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("전화번호 목록")
class _phone_number_list_test {
    
    @Builder
    @Getter
    static class TestCase {
        String[] phone_book;
        
        boolean expected;
    }
    
    _phone_number_list solution;
    ArrayList<TestCase> testCase;
    
    @BeforeEach
    void setUp() {
        solution = new _phone_number_list();
        testCase = new ArrayList<>();
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .phone_book(new String[]{"119", "97674223", "1195524421"})
                        .expected(false)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .phone_book(new String[]{"123", "456", "789"})
                        .expected(true)
                        .build()
        );
        
        testCase.add(
                new TestCase.TestCaseBuilder()
                        .phone_book(new String[]{"12", "123", "1235", "567", "88"})
                        .expected(false)
                        .build()
        );
    }
    
    @Test
    @DisplayName("입출력 예 테스트")
    void solution() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getPhone_book()))
                    .isEqualTo(aCase.isExpected());
        }
    }
}