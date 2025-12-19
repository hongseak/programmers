package org.example.codingtest.level0.q5.심폐소생술;

/** [빈칸 채우기 문제입니다.]
 *  빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
 *  빈칸을 제외한 기본 코드는 수정할 수 없습니다.
 *  빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.
 *  */

public class Q5_심폐소생술 {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};
        int input = 0; // << 변수가 들어간 곳을 처리해주세요

        for(int i=0; i<(input); i++){
            for(int j=0; j<(input); j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] = (input)                    ;
                    break;
                }
            }
        }
        return answer;
    }
}
