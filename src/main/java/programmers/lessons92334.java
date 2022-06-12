package main.java.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/92334?language=java
public class lessons92334 {
    public static void main(String[] args) {
        Solution92334 solution = new Solution92334();
        solution.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},2);
        solution.solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},2);
    }
}

class Solution92334 {
    public int[] solution(String[] id_list, String[] reportParam, int k) {
        int[] answer = new int[id_list.length];
        String[] report = delDup(reportParam);
        List<String>[] listArr = new List[id_list.length];

        for(int i = 0; i<listArr.length; i++){
            listArr[i] = new ArrayList<String>();
        }

        for(String rep : report){
            String[] arr = rep.split(" ");
            String from = arr[0];
            String to = arr[1];

            listArr[getIndex(to, id_list)].add(from);
        }

        for(List<String> list : listArr){
            if(list.size() >= k){
                for(String user : list){
                    answer[getIndex(user, id_list)]++;
                }
            }
        }

        return answer;
    }

    public int getIndex(String name, String[] id_list){
        int i = 0;
        while(!name.equals(id_list[i])){
            i++;
        }
        return i;
    }

    public String[] delDup(String[] report){
        List<String> res = new ArrayList<>();
        String str = "";
        Arrays.sort(report);

        for(String rep : report){
            if(!str.equals(rep)){
                res.add(rep);
                str = rep;
            }
        }

        return res.toArray(new String[res.size()]);
    }
}