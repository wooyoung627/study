package main.java.programmers;

public class lessons67256 {
    public static void main(String[] args) {
        Solution67256 solution = new Solution67256();
        System.out.println(solution.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
    }
}

class Solution67256 {
    public String solution(int[] numbers, String hand) {
        String finger = "right".equals(hand) ? "R" : "L";
        StringBuilder sb = new StringBuilder();

        int rCur= 12, lCur = 10;

        for(int number : numbers){
            if(number == 0) number = 11;

            if(number == 2 || number == 5 || number == 8 || number == 11){
                double rLen = length(rCur, number);
                double lLen = length(lCur, number);

                if(rLen == lLen){
                    sb.append(finger);
                    if("right".equals(hand)){
                        rCur = number;
                    }else{
                        lCur = number;
                    }
                }else if(rLen < lLen){
                    sb.append("R");
                    rCur = number;
                }else {
                    sb.append("L");
                    lCur = number;
                }
            }else if(number == 1 || number == 4 || number == 7){
                sb.append("L");
                lCur = number;
            }else{
                sb.append("R");
                rCur = number;
            }
        }

        return sb.toString();
    }

    int min;

    public double length(int from, int to){
        min = Integer.MAX_VALUE;
        dfs(from, to, 0);
        return min;
    }

    public void dfs(int from, int to, int num){
        if(from == to){
            min = Math.min(min, num);
            return;
        }else if(num >= min){
            return;
        }
        if(from < to){
            dfs(from+1, to, num + 1);
            dfs(from+3, to, num + 1);
        }else{
            dfs(from-1, to, num + 1);
            dfs(from-3, to, num + 1);
        }
    }
}