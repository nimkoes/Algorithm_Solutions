package com.nimkoes.level3;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("베스트앨범")
class _best_album_test {

    @Builder
    @Getter
    static class TestCase {
        String[] genres;
        int[] plays;

        int[] expected;
    }

    _best_album solution;

    @BeforeEach
    void setUp() {
        solution = new _best_album();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .genres(new String[]{"classic", "pop", "classic", "classic", "pop"})
                .plays(new int[]{500, 600, 150, 800, 2500})
                .expected(new int[]{4, 1, 3, 0})
                .build();

        assertThat(solution.solution(testCase.getGenres(), testCase.getPlays()))
                .isEqualTo(testCase.getExpected());
    }
}
