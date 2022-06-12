package main.java.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/60057
public class lessons60057 {
    public static void main(String[] args){
        Solution60057 solution = new Solution60057();
        String s = "ababcdcdababcdcdababcdcdababcdcd";
        System.out.println(solution.solution(s));
    }
}

class Solution60057 {
    public int solution(String s) {
        int min = s.length();
        StringBuilder sb = new StringBuilder();
        String memory = "";
        int i, j, cnt = 1;

        for(i = 1; i<= s.length()/2; i++){
            memory = s.substring(0, i);
            for(j = i; j+i<=s.length(); j+=i){
                if(memory.equals(s.substring(j, j+i))){
                    cnt ++;
                }else{
                    sb.append(cnt == 1 ? memory : cnt+memory);
                    cnt = 1;
                    memory = s.substring(j, j+i);
                }
            }

            sb.append((cnt == 1 ? "" : cnt )+ memory + s.substring(j));

            min = Math.min(sb.toString().length(), min);
            sb = new StringBuilder();
            cnt = 1;
        }

        return min;
    }
}