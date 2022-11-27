package com.nimkoes.programmers.level2;

import java.util.Stack;

public class Solution_053 {
    public int solution(String s) {
        int len = s.length();
        if (len % 2 != 0) return 0;

        int answer = 0;
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < len; ++i) {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            answer += getCheckResult(sb.toString(), len);
        }

        return answer;
    }

    private int getCheckResult(String target, int len) {

        if (!isLeft(target.charAt(0))) return 0;

        Stack<Character> stack = new Stack<>();
        stack.push(target.charAt(0));

        for (int i = 1; i < len; ++i) {
            char ch = target.charAt(i);
            if (isLeft(ch)) {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.peek().equals(getOpposite(ch))) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        if (stack.isEmpty()) return 1;
        else return 0;
    }

    private char getOpposite(char target) {
        if (target == '(') return ')';
        if (target == '{') return '}';
        if (target == '[') return ']';

        if (target == ')') return '(';
        if (target == '}') return '{';
        if (target == ']') return '[';

        return ' ';
    }

    private boolean isLeft(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }
}
