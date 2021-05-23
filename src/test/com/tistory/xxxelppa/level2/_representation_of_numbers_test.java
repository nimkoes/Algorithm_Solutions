package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("숫자의 표현")
class _representation_of_numbers_test {

    @Builder
    @Getter
    static class TestCase {
        int n;

        int expected;
    }

    _representation_of_numbers solution;

    @BeforeEach
    void setUp() {
        solution = new _representation_of_numbers();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(15)
                .expected(4)
                .build();

        assertThat(solution.solution(testCase.getN()))
                .isEqualTo(testCase.getExpected());
    }
}