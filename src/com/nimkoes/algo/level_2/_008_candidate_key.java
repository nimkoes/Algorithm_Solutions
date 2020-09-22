package com.nimkoes.algo.level_2;

import java.util.*;

public class _008_candidate_key {
    public static void main(String[] ar) {
        _008_candidate_key simulate = new _008_candidate_key();
        int result = simulate.solution(simulate.getRelation());
        System.out.println(result);
    }

    public int solution(String[][] relation) {
        int answer = 0;
        int rowSize = relation.length;
        int colSize = relation[0].length;
        List<Integer> candidates = new LinkedList<Integer>();

        for(int i = 1; i < 1 << colSize; ++i)
            if(check(relation, rowSize, colSize, i) == true) candidates.add(i);

        Collections.sort(candidates, comp);

        while(candidates.size() != 0) {
            int n = candidates.remove(0);
            ++answer;

            for(Iterator<Integer> it = candidates.iterator(); it.hasNext();) {
                int c = it.next();
                if((n & c) == n) it.remove();
            }
        }

        return answer;
    }

    Comparator<Integer> comp = new Comparator<Integer>() {
        int countBits(int n) {
            int ret = 0;
            while(n != 0) {
                if((n & 1) != 0) ++ret;
                n = n >> 1;
            }
            return ret;
        }
        @Override
        public int compare(Integer o1, Integer o2) {
            int x = countBits(o1), y = countBits(o2);
            if(x > y) return 1;
            else if (x < y) return -1;
            else return 0;
        }
    };

    boolean check(String[][] relation, int rowSize, int colSize, int subset) {
        for(int a = 0; a < rowSize - 1; ++a) {
            for(int b = a + 1; b < rowSize; ++b) {
                boolean isSame = true;
                for(int k = 0; k < colSize; ++k) {
                    if((subset & 1 << k) == 0) continue;
                    if(relation[a][k].equals(relation[b][k]) == false) {
                        isSame = false;
                        break;
                    }
                }
                if(isSame) return false;
            }
        }
        return true;
    }

    /*
     * SET TEST PARAM
     */

    private String[][] relation;

    public _008_candidate_key() {
        relation = new String[][] {
                {"100", "ryan"  , "music"   , "2"},
                {"200", "apeach", "math"    , "2"},
                {"300", "tube"  , "computer", "3"},
                {"400", "con"   , "computer", "4"},
                {"500", "muzi"  , "music"   , "3"},
                {"600", "apeach", "music"   , "2"}
        };
    }

    public String[][] getRelation() {
        return relation;
    }
}
