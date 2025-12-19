package org.example.codingtest.level0.q3.나이_계산;

import java.util.Scanner;

/** [빈칸 채우기 문제입니다.]
 *  빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
 *  빈칸을 제외한 기본 코드는 수정할 수 없습니다.
 *  빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.
 *  */


public class Q3_나이_계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("[빈칸]")) {
//            answer = "[빈칸]";
        }
        else if (age_type.equals("Year")) {
//            "[빈칸]";
        }

        System.out.println(answer);
    }
}
