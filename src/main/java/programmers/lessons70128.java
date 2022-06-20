package main.java.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/70128
public class lessons70128 {
    public static void main(String[] args) {
        Solution70128 solution = new Solution70128();
        System.out.println(solution.solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2}));
    }
}

class Solution70128 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++)
            answer += (a[i]*b[i]);
        return answer;
    }
}