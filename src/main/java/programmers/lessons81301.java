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
        int begin = 0, end = 1;
        String num = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                if(!"".equals(num)){
                    int n = getNum(num);
                    answer = answer*10 + n;
                    num = "";
                }

                answer = answer*10 + Integer.parseInt(s.substring(i, i+1));
            }else{
                int n = getNum(num);
                if(n != -1){
                    answer = answer*10 + n;
                    num = "";
                }
                num += s.substring(i, i+1);
            }
        }

        int n = getNum(num);
        if(n != -1){
            answer = answer*10 + n;
        }

        return answer;
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