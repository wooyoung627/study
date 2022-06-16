package main.java.programmers;

public class lessons67256 {
    public static void main(String[] args) {
        Solution67256 solution = new Solution67256();
        System.out.println(solution.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
    }
}

class Solution67256 {
    public String solution(int[] numbers, String hand) {
        String finger = "right".equals(hand) ? "R" : "L";
        StringBuilder sb = new StringBuilder();

        int rCur= 10, lCur = 12;

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

    public double length(int from, int to){
        int[][] arr = new int[4][3];
        for(int i=0;i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                arr[j][i] = j*3+i+1;
            }
        }

        int iFrom=0,jFrom=0;
        int iTo=0, jTo = 0;

        for(int i=0;i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j][i] == from){
                    iFrom = i;
                    jFrom = j;
                }
                if(arr[j][i] == to){
                    iTo = i;
                    jTo = j;
                }
            }
        }
        return Math.pow(iFrom - iTo, 2) + Math.pow(jFrom-jTo, 2);
    }
}