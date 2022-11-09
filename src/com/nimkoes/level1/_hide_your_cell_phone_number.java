package com.nimkoes.level1;

public class _hide_your_cell_phone_number {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phone_number.length() - 4; ++i) sb.append("*");
        
        sb.append(phone_number.substring(phone_number.length() - 4));
        
        return sb.toString();
    }
}
