package main.java.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lessons42840 {
    public static void main(String[] args) {
        Solution42840 solution = new Solution42840();
        System.out.println(Arrays.toString(solution.solution(new int[]{1,2,3,4,5})));
    }
}

class Solution42840 {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int oneN=0, twoN=0, threeN=0;
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<answers.length; i++){
            if(one[i % one.length] == answers[i]){
                oneN++;
            }
            if(two[i % two.length] == answers[i]){
                twoN++;
            }
            if(three[i % three.length] == answers[i]){
                threeN++;
            }
        }

        int max = Math.max(oneN, twoN);
        max=Math.max(max,threeN);

        if(max==oneN)
            res.add(1);
        if(max==twoN)
            res.add(2);
        if(max==threeN)
            res.add(3);

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}