package ProgrammersLevel1;

/*      문제 : 완주하지 못한 선수
        문제 설명 :
        수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

        마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

        출처 : 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
        */

/*
* 정확성: 50.0 효율성: 50.0 합계: 100.0 / 100.0
* */

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String strParticipant : participant) {
            if (map.containsKey(strParticipant)) {
                int val = map.get(strParticipant) + 1;
                map.put(strParticipant, val);
            } else {
                map.put(strParticipant, 1);
            }
        }

        for (String strCompletion : completion) {
                int val = map.get(strCompletion) - 1;
                map.put(strCompletion, val);
        }

        for (String person : participant) {
            if (map.get(person) > 0) {
                answer = person;
            }
        }
        return answer;
    }
}

public class P001_IncompletePlayer {
    public static void main(String args[]) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Solution solution = new Solution();
        String answer = solution.solution(participant, completion);

        System.out.println("answer : " + answer);
    }
}
