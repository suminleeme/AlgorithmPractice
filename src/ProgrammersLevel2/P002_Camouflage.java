package ProgrammersLevel2;

/*      문제 : 위장
        문제 설명 :
        스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.

        예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.

        종류	이름
        얼굴	동그란 안경, 검정 선글라스
        상의	파란색 티셔츠
        하의	청바지
        겉옷	긴 코트
        스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.

        출처 : 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
        */

import java.util.HashMap;

class Solution_Camouflage {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < clothes.length; i++) {
            String category = clothes[i][1];
            int val = 1;

            if (map.containsKey(category)) {
                val = map.get(category) + 1;
            }
            map.put(category, val);
        }

        int val = 0;
        for (String key : map.keySet()) {
            val = map.get(key) + 1;
            answer *= val;
        }
        answer--;

        return answer;
    }

}

public class P002_Camouflage {
    public static void main(String[] args) {
        String[][] clothes1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};

        Solution_Camouflage solution = new Solution_Camouflage();
        int answer1 = solution.solution(clothes1);
        int answer2 = solution.solution(clothes2);

        System.out.println("answer1 : " + answer1);
        System.out.println("answer2 : " + answer2);
    }
}
