package com.nimkoes.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("압축")
class _compression_test {

    @Builder
    @Getter
    static class TestCase {
        String msg;

        int[] expected;
    }

    _compression solution;

    @BeforeEach
    void setUp() {
        solution = new _compression();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .msg("KAKAO")
                .expected(new int[]{11, 1, 27, 15})
                .build();

        assertThat(solution.solution(testCase.getMsg()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .msg("TOBEORNOTTOBEORTOBEORNOT")
                .expected(new int[]{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34})
                .build();

        assertThat(solution.solution(testCase.getMsg()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .msg("ABABABABABABABAB")
                .expected(new int[]{1, 2, 27, 29, 28, 31, 30})
                .build();

        assertThat(solution.solution(testCase.getMsg()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_04() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .msg("THATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITISTHATTHATISISTHATTHATISNOTISNOTISTHATITITIS")
                .expected(new int[]{20, 8, 1, 20, 27, 29, 9, 19, 33, 31, 30, 28, 20, 33, 14, 15, 39, 19, 41, 43, 36, 9, 39, 46, 38, 47, 34, 19, 36, 52, 45, 40, 42, 35, 38, 48, 62, 54, 51, 61, 53, 55, 66, 57, 44, 59, 64, 32, 49, 60, 29, 52, 76, 37, 32, 71, 43, 70, 47, 75, 73, 80, 43, 79, 56, 72, 84, 61, 86, 68, 81, 90, 69, 92, 72, 85, 63, 96, 89, 87, 91, 83, 101, 94, 103, 65, 97, 106, 99, 108, 50, 74, 111, 77, 66, 98, 81, 70, 93, 118, 117, 88, 33, 122, 116, 58, 127, 62, 127, 78, 114, 123, 100, 133, 95, 112, 105, 104, 132, 145, 87, 134, 130, 129, 137, 131, 82, 79, 148, 151, 150, 144, 153, 159, 102, 135, 121, 156, 159, 125, 75, 162, 113, 158, 124, 109, 126, 149, 67, 142, 146, 166, 155, 158, 174, 171, 140, 119, 128, 175, 120, 138, 152, 161, 174, 181, 139, 154, 141, 187, 143, 176, 165, 172, 167, 191, 164, 182, 194, 184, 136, 170, 193, 147, 86})
                .build();

        assertThat(solution.solution(testCase.getMsg()))
                .isEqualTo(testCase.getExpected());
    }
}
