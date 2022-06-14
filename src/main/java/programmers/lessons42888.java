package main.java.programmers;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42888
public class lessons42888 {
    public static void main(String[] args) {
        Solution42888 solution = new Solution42888();
        System.out.println(Arrays.toString(solution.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"})));
    }
}

class Solution42888 {
    public String[] solution(String[] record) {
        List<String> result = new ArrayList<>();

        Map<String, String> idNickName = new HashMap<>();

        for(String rec : record){
            String[] tmp = rec.split(" ");
            if("Enter".equals(tmp[0]) || "Change".equals(tmp[0])){
                idNickName.put(tmp[1], tmp[2]);
            }
        }

        for(String rec : record){
            String[] tmp = rec.split(" ");

            if("Enter".equals(tmp[0])){
                result.add(idNickName.get(tmp[1]) + "님이 들어왔습니다.");
            }else if("Leave".equals(tmp[0])){
                result.add(idNickName.get(tmp[1]) + "님이 나갔습니다.");
            }
        }


        return result.toArray(new String[result.size()]);
    }
}