package com.nimkoes.level0;

import java.math.BigInteger;

public class Solution_078 {
    public int solution(int balls, int share) {
        BigInteger[] pc = new BigInteger[31];
        pc[0] = BigInteger.valueOf(1);
        pc[1] = BigInteger.valueOf(1);

        for (int i = 2; i <= 30; ++i) pc[i] = pc[i - 1].multiply(BigInteger.valueOf(i));
        return (pc[balls].divide(pc[balls - share].multiply(pc[share]))).intValue();
    }
}
