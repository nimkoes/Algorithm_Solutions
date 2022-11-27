package com.nimkoes.programmers.level3;

import com.nimkoes.programmers.level3._travel_route;
import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("여행경로")
class _travel_route_test {

    @Builder
    @Getter
    static class TestCase {
        String[][] tickets;

        String[] expected;
    }

    _travel_route solution;

    @BeforeEach
    void setUp() {
        solution = new _travel_route();
    }

    @Test
    @DisplayName("입출력 예 테스트 1")
    void test_01() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .tickets(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}})
                .expected(new String[]{"ICN", "JFK", "HND", "IAD"})
                .build();

        assertThat(solution.solution(testCase.getTickets()))
                .isEqualTo(testCase.getExpected());
    }

    @Test
    @DisplayName("입출력 예 테스트 2")
    void test_02() {
        TestCase testCase = new TestCase.TestCaseBuilder()
                .tickets(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}})
                .expected(new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"})
                .build();

        assertThat(solution.solution(testCase.getTickets()))
                .isEqualTo(testCase.getExpected());
    }
}
