package com.nimkoes.leetcode.medium;

public class Solution_009 {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < result.length; ++i) result[i] = getQueryInsidePointCount(queries[i], points);
        return result;
    }

    private int getQueryInsidePointCount(int[] query, int[][] points) {
        int result = 0;
        for (int[] point : points) {
            if (getDistance(point, query) <= query[2]) ++result;  // query ~ point 거리 < 반지름 확인
        }
        return result;
    }

    private double getDistance(int[] point, int[] query) {
        return Math.sqrt(Math.pow(query[0] - point[0], 2) + Math.pow(query[1] - point[1], 2));
    }
}

/* result summary
Runtime: 46 ms, faster than 26.70% of Java online submissions for Queries on Number of Points Inside a Circle.
Memory Usage: 43.5 MB, less than 16.53% of Java online submissions for Queries on Number of Points Inside a Circle.
 */

