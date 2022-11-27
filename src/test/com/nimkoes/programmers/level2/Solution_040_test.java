package com.nimkoes.programmers.level2;

import com.nimkoes.programmers.level2.Solution_040;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("파일명 정렬")
class Solution_040_test {

    @Builder
    @Getter
    static class TestCase {
        String[] files;

        String[] expected;
    }

    Solution_040 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution_040();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .files(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})
                .expected(new String[]{"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"})
                .build();

        assertThat(solution.solution(testCase.getFiles()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .files(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"})
                .expected(new String[]{"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"})
                .build();

        assertThat(solution.solution(testCase.getFiles()))
                .isEqualTo(testCase.getExpected());
    }
}
