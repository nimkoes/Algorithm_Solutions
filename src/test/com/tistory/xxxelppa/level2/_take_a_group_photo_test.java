package com.tistory.xxxelppa.level2;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("단체사진 찍기")
class _take_a_group_photo_test {

    @Builder
    @Getter
    static class TestCase {
        int n;
        String[] data;

        int expected;
    }

    _take_a_group_photo solution;

    @BeforeEach
    void setUp() {
        solution = new _take_a_group_photo();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(2)
                .data(new String[]{"N~F=0", "R~T>2"})
                .expected(3648)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getData()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .n(2)
                .data(new String[]{"M~C<2", "C~M>1"})
                .expected(0)
                .build();

        assertThat(solution.solution(testCase.getN(), testCase.getData()))
                .isEqualTo(testCase.getExpected());
    }
}