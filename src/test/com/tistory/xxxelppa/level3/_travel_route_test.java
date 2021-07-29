package com.tistory.xxxelppa.level3;

import lombok.Builder;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class _travel_route_test {

    @Builder
    @Getter
    static class TestCase {
        String[][] tickets;

        String[] expected;
    }

    _travel_route solution;
    ArrayList<TestCase> testCase;


    @BeforeEach
    void setUp() {
        solution = new _travel_route();
        testCase = new ArrayList<>();

        testCase.add(
                new TestCase.TestCaseBuilder()
                        .tickets(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}})
                        .expected(new String[]{"ICN", "JFK", "HND", "IAD"})
                        .build()
        );

        testCase.add(
                new TestCase.TestCaseBuilder()
                        .tickets(new String[][]{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}})
                        .expected(new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"})
                        .build()
        );
    }

    @Test
    @DisplayName("입출력 예 테스트")
    void name() {
        for (TestCase aCase : testCase) {
            assertThat(solution.solution(aCase.getTickets()))
                    .isEqualTo(aCase.getExpected());
        }
    }

}