package com.nimkoes.level1;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

    @BeforeEach
    void setUp() {
        solution = new _recommend_new_id();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .new_id("...!@BaT#*..y.abcdefghijklm")
                .expected("bat.y.abcdefghi")
                .build();

        assertThat(solution.solution(testCase.getNew_id()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .new_id("z-+.^.")
                .expected("z--")
                .build();

        assertThat(solution.solution(testCase.getNew_id()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .new_id("=.=")
                .expected("aaa")
                .build();

        assertThat(solution.solution(testCase.getNew_id()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_04() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .new_id("123_.def")
                .expected("123_.def")
                .build();

        assertThat(solution.solution(testCase.getNew_id()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 5")
    void test_05() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .new_id("abcdefghijklmn.p")
                .expected("abcdefghijklmn")
                .build();

        assertThat(solution.solution(testCase.getNew_id()))
                .isEqualTo(testCase.getExpected());
    }
}
