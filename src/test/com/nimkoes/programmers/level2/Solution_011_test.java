package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_011;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("전화번호 목록")
class Solution_011_test {

    @Builder
    @Getter
    static class TestCase {
        String[] phone_book;

        boolean expected;
    }

    Solution_011 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_011();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .phone_book(new String[]{"119", "97674223", "1195524421"})
                .expected(false)
                .build();

        assertThat(solution.solution(testCase.getPhone_book()))
                .isEqualTo(testCase.isExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .phone_book(new String[]{"123", "456", "789"})
                .expected(true)
                .build();

        assertThat(solution.solution(testCase.getPhone_book()))
                .isEqualTo(testCase.isExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .phone_book(new String[]{"12", "123", "1235", "567", "88"})
                .expected(false)
                .build();

        assertThat(solution.solution(testCase.getPhone_book()))
                .isEqualTo(testCase.isExpected());
    }
}
