package com.nimkoes.level1;

public class _making_prime_numbers {
    public int solution(int[] nums) {
        int answer = 0;
        int num_len = nums.length;
        
        for (int i = 0; i < num_len - 2; ++i) {
            for (int j = i + 1; j < num_len - 1; ++j) {
                for (int k = j + 1; k < num_len; ++k) {
                    int checkNum = nums[i] + nums[j] + nums[k];
                    if (isPrime(checkNum)) ++answer;
                }
            }
        }
        return answer;
    }
    
    public boolean isPrime(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i < num / 2; ++i) if (num % i == 0) return false;
        return true;
    }
}
