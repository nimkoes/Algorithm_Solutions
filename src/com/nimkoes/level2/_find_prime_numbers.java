package com.nimkoes.level2;

import java.util.HashSet;

public class _find_prime_numbers {
    HashSet<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        permutation("", numbers);
        for (int a : set) {
            if (a == 2) answer++;
            if (a % 2 != 0 && isPrime(a)) answer++;
        }
        return answer;
    }
    
    public boolean isPrime(int n) {
        if (n == 0 || n == 1) return false;
        int loopCnt = (int) Math.sqrt(n);
        for (int i = 3; i <= loopCnt; i += 2) if (n % i == 0) return false;
        return true;
    }
    
    public void permutation(String prefix, String str) {
        int n = str.length();
        if (!prefix.equals("")) {
            int o = Integer.parseInt(prefix);
            set.add(o);
        }
        
        for (int i = 0; i < n; i++) permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        
    }
}
