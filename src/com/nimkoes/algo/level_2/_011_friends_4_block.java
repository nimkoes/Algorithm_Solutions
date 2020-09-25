package com.nimkoes.algo.level_2;

import java.util.Scanner;

public class _011_friends_4_block {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();
        _011_friends_4_block simulate = new _011_friends_4_block(tcNum);
        int result = simulate.solution(simulate.getM(), simulate.getN(), simulate.getBoard());
        System.out.println(result);
    }


    String[][] newBoard;
    Boolean[][] deleteBoard;
    int maxRowIndex, maxColIndex;

    public int solution(int m, int n, String[] board) {
        int answer = 0;

        newBoard = new String[m][n];
        deleteBoard = new Boolean[m][n];
        maxRowIndex = m-1;
        maxColIndex = n-1;

        for(int i = 0; i < m; ++i) newBoard[i] = board[i].split("");

        for(int i = 0; i < deleteBoard.length; ++i)
            for (int j = 0; j < deleteBoard[0].length; ++j)
                deleteBoard[i][j] = false;

        boolean isChanged = true;
        while(isChanged) {
            isChanged = false;

            for(int i = 0; i < m-1; ++i) {
                for(int j = 0; j < n-1; ++j) {
                    if(newBoard[i][j].equals("")) continue;

                    if(canErase(i, j)) {
                        isChanged = true;
                        deleteBoard[i][j] = true;
                        deleteBoard[i+1][j] = true;
                        deleteBoard[i][j+1] = true;
                        deleteBoard[i+1][j+1] = true;
                    }
                }
            }

            if(isChanged) {
                for(int i = 0; i <= maxRowIndex; ++i)
                    for(int j = 0; j <= maxColIndex; ++j)
                        if(deleteBoard[i][j]) {
                            newBoard[i][j] = "";
                            deleteBoard[i][j] = false;
                        }

                for(int i = 0; i <= maxColIndex; ++i) {
                    int blankRowIndex = -1, blankColIndex = -1;
                    for(int j = maxRowIndex; j >= 0; --j) {
                        if (newBoard[j][i].equals("")) {
                            blankRowIndex = j;
                            blankColIndex = i;
                            break;
                        }
                    }

                    for(int j = blankRowIndex; j >= 0; --j) {
                        if(!newBoard[j][i].equals("")) {
                            newBoard[blankRowIndex--][blankColIndex] = newBoard[j][i];
                            newBoard[j][i] = "";
                        }
                    }
                }
            }
        }

        for(int k = 0; k < m; ++k)
            for (int l = 0; l < n; ++l)
                if(newBoard[k][l].equals("")) ++answer;

        return answer;
    }

    private boolean canErase(int i, int j) {
        if(i < 0 || j < 0 || i >= maxRowIndex || j >= maxColIndex) return false;
        String target = newBoard[i][j];
        return newBoard[i + 1][j].equals(target) && newBoard[i][j + 1].equals(target) && newBoard[i + 1][j + 1].equals(target);
    }

    /*
     * SET TEST PARAM
     */

    private int m;
    private int n;
    private String[] board;

    public _011_friends_4_block(int tcNum) {
        switch (tcNum) {
            case 1:
                m = 4;
                n = 5;
                board = new String[] {
                        "CCBDE",
                        "AAADE",
                        "AAABF",
                        "CCBBF"
                };
                break;
            case 2:
                m = 6;
                n = 6;
                board = new String[] {
                        "TTTANT",
                        "RRFACC",
                        "RRRFCC",
                        "TRRRAA",
                        "TTMMMF",
                        "TMMTTJ"
                };
                break;
        }
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public String[] getBoard() {
        return board;
    }
}
