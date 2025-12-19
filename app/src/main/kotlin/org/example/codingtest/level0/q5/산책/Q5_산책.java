package org.example.codingtest.level0.q5.산책;

/** [빈칸 채우기 문제입니다.]
 *  빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
 *  빈칸을 제외한 기본 코드는 수정할 수 없습니다.
 *  빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.
 *  */

public class Q5_산책 {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
//                    "[빈칸]"
                    break;
                case 'E':
//                    "[빈칸]"
                    break;
                case 'W':
//                    "[빈칸]"
//                    "[빈칸]"
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}
