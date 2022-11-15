package com.nimkoes.level0;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("로그인 성공?")
class Solution_087_test {

    @Builder
    @Getter
    static class TestCase {
        String[] id_pw;
        String[][] db;
        String expected;
    }

    Solution_087 solution;


    @BeforeEach
    void setUp() {
        solution = new Solution_087();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .id_pw(new String[]{"meosseugi", "1234"})
                .db(new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}})
                .expected("login")
                .build();

        assertThat(solution.solution(testCase.getId_pw(), testCase.getDb()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .id_pw(new String[]{"programmer01", "15789"})
                .db(new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}})
                .expected("wrong pw")
                .build();

        assertThat(solution.solution(testCase.getId_pw(), testCase.getDb()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .id_pw(new String[]{"rabbit04", "98761"})
                .db(new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}})
                .expected("fail")
                .build();

        assertThat(solution.solution(testCase.getId_pw(), testCase.getDb()))
                .isEqualTo(testCase.getExpected());
    }
}
