package main.java.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://programmers.co.kr/learn/courses/30/lessons/86051
public class lessons86051 {
    public static void main(String[] args) {
        Solution86051 solution = new Solution86051();
        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }
}

class Solution86051 {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int num : numbers)
            answer -= num;

        return answer;
    }
}