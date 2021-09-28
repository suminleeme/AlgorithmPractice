package ProgrammersLevel2;

/*      문제 : 전화번호 목록
        문제 설명 :
        전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
        전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

        구조대 : 119
        박준영 : 97 674 223
        지영석 : 11 9552 4421
        전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

        출처 : 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
        */

/* 효율성 테스트 케이스 3개 실패
* 정확성: 83.3 효율성: 0.0 합계: 83.3 / 100.0
*/

import java.util.Arrays;

class Solution {
    public boolean Solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].startsWith(phone_book[i])) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}

public class P002_PhoneNumberList {
    public static void main(String args[]) {
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123","456","789"};
        String[] phone_book3 = {"12","123","1235","567","88"};

        Solution solution = new Solution();
        boolean answer1 = solution.Solution(phone_book1);
        boolean answer2 = solution.Solution(phone_book2);
        boolean answer3 = solution.Solution(phone_book3);

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }
}