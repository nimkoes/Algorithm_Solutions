package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("캐시")
class _cache_test {

    @Builder
    @Getter
    static class TestCase {
        int cacheSize;
        String[] cities;

        int expected;
    }

    _cache solution;

    @BeforeEach
    void setUp() {
        solution = new _cache();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .cacheSize(3)
                .cities(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"})
                .expected(50)
                .build();

        assertThat(solution.solution(testCase.getCacheSize(), testCase.getCities()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .cacheSize(3)
                .cities(new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"})
                .expected(21)
                .build();

        assertThat(solution.solution(testCase.getCacheSize(), testCase.getCities()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 3")
    void test_03() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .cacheSize(2)
                .cities(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})
                .expected(60)
                .build();

        assertThat(solution.solution(testCase.getCacheSize(), testCase.getCities()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 4")
    void test_04() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .cacheSize(5)
                .cities(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})
                .expected(52)
                .build();

        assertThat(solution.solution(testCase.getCacheSize(), testCase.getCities()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 5")
    void test_05() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .cacheSize(2)
                .cities(new String[]{"Jeju", "Pangyo", "NewYork", "newyork"})
                .expected(16)
                .build();

        assertThat(solution.solution(testCase.getCacheSize(), testCase.getCities()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 6")
    void test_06() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .cacheSize(0)
                .cities(new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"})
                .expected(25)
                .build();

        assertThat(solution.solution(testCase.getCacheSize(), testCase.getCities()))
                .isEqualTo(testCase.getExpected());
    }
}
