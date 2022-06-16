package main.java.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/81301
public class lessons81301 {
    public static void main(String[] args) {
        Solution81301 solution = new Solution81301();
        System.out.println(solution.solution("one4seveneight"));
    }
}

class Solution81301 {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(sb.length() > 0 && getNum(sb.toString()) > -1){
                answer = answer*10 + getNum(sb.toString());
                sb = new StringBuilder();
            }

            if(isNum(s.charAt(i))){
                answer = answer*10 + Integer.parseInt(s.substring(i, i+1));
            }else{
                sb.append(s.substring(i, i+1));
            }
        }

        if(getNum(sb.toString()) != -1){
            answer = answer*10 + getNum(sb.toString());
        }

        s.replaceAll("", "");

        return answer;
    }

    public boolean isNum(Character str){
        if(str >= '0' && str <= '9')
            return true;
        return false;
    }

    public int getNum(String str){
        switch(str){
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            default:
            return -1;
        }
    }
}