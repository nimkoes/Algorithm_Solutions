package com.tistory.xxxelppa.level2;

public class _parenthesis_conversion {
    public String solution(String p) {
        if (p.equals("")) return "";
        
        int pos = getSeparatePosition(p);
        String u = p.substring(0, pos);
        String v = p.substring(pos);
        
        if (isCorrect(u)) return u + solution(v);
        
        String temp = "(" + solution(v) + ")";
        String new_u = u.substring(1, u.length() - 1);
        new_u = reverse(new_u);
        return temp + new_u;
    }
    
    public int getSeparatePosition(String w) {
        int lc = 0, rc = 0;
        
        for (int i = 0; i < w.length(); ++i) {
            if (w.charAt(i) == '(') ++lc;
            else ++rc;
            
            if (lc - rc == 0) return (i + 1);
        }
        return -1;
    }
    
    public boolean isCorrect(String p) {
        if (p.charAt(0) != '(') return false;
        int valid = 0;
        
        for (int i = 0; i < p.length(); ++i) {
            if (p.charAt(i) == '(') ++valid;
            else --valid;
            
            if (valid < 0) return false;
        }
        return true;
    }
    
    public String reverse(String p) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < p.length(); ++i) {
            if (p.charAt(i) == '(') sb.append(")");
            else sb.append("(");
        }
        return sb.toString();
    }
}
