package main.java.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/76501
public class lessons76501 {
    public static void main(String[] args) {
        Solution76501 solution = new Solution76501();
        System.out.println(solution.solution(new int[]{4,7,12}, new boolean[]{true,false,true}));
    }
}

class Solution76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i<absolutes.length; i++)
            answer += (signs[i] ? 1 : -1) * absolutes[i];
        return answer;
    }
}