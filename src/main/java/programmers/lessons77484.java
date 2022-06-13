package main.java.programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/77484
public class lessons77484 {
    public static void main(String[] args){
        Solution77484 solution = new Solution77484();
        System.out.println(Arrays.toString(solution.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25})));
    }
}

class Solution77484{
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int match = 0;
        int i=0, j=0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        while(i<lottos.length && j<win_nums.length){
            if(lottos[i]==0) {
                zero++;
                i++;
            }else if(lottos[i] == win_nums[j]){
                match++;
                i++;
                j++;
            }else if(lottos[i] > win_nums[j]){
                j++;
            }else{
                i++;
            }
        }

        int[] answer = new int[]{match+zero > 1 ? 7-(match+zero) : 6, match > 1 ? 7-match : 6};

        return answer;
    }
}