package com.tistory.xxxelppa.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class _maximize_formula {
    private char[] operator;
    private long answer;
    private String exp;
    
    public long solution(String expression) {
        
        exp = expression;
        
        List<Character> op = new ArrayList<>();
        if (expression.contains("+")) op.add('+');
        if (expression.contains("-")) op.add('-');
        if (expression.contains("*")) op.add('*');
        
        operator = new char[op.size()];
        
        for (int i = 0; i < operator.length; ++i) operator[i] = op.get(i);
        
        answer = -1;
        makeAnswer(0);
        
        return answer;
    }
    
    public void makeAnswer(int size) {
        if (size == operator.length) {
            long ret = calc();
            answer = Math.max(ret, answer);
            return;
        }
        
        for (int i = size; i < operator.length; ++i) {
            swap(i, size);
            makeAnswer(size + 1);
            swap(i, size);
        }
    }
    
    public void swap(int i, int j) {
        char temp = operator[i];
        operator[i] = operator[j];
        operator[j] = temp;
    }
    
    public long calc() {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < operator.length; ++i) hm.put(operator[i] + "", i);
        
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        Stack<String> st = new Stack<>();
        
        int size = exp.length();
        for (int i = 0; i < size; ++i) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*') {
                list.add(sb.toString());
                sb.delete(0, sb.length());
                while (!st.isEmpty() && hm.get(ch + "") <= hm.get(st.peek())) list.add(st.pop());
                st.push(ch + "");
            } else {
                sb.append(ch);
            }
        }
        
        list.add(sb.toString());
        while (!st.isEmpty()) list.add(st.pop());
        
        Stack<Long> val = new Stack<>();
        for (String elem : list) {
            if (hm.containsKey(elem)) {
                long b = val.pop();
                long a = val.pop();
                
                if (elem.equals("+")) val.push(a + b);
                if (elem.equals("-")) val.push(a - b);
                if (elem.equals("*")) val.push(a * b);
            } else {
                val.push(Long.parseLong(elem));
            }
        }
        return Math.abs(val.pop());
    }
}
