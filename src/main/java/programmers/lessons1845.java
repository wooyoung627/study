package main.java.programmers;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/1845
public class lessons1845 {
    public static void main(String[] args) {
        Solution1845 solution = new Solution1845();
        System.out.println(solution.solution(new int[]{3, 1, 2, 3}));
    }
}

class Solution1845 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        return set.size() > nums.length/2 ? nums.length/2 : set.size();
    }
}