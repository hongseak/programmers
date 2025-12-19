package org.example.codingtest.level0.q4.저축;

/** [빈칸 채우기 문제입니다.]
 *  빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
 *  빈칸을 제외한 기본 코드는 수정할 수 없습니다.
 *  빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.
 *  */

import java.util.Scanner;

public class Q4_저축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += 0; // << 0 은 "[빈칸]"
            month++;
        }
        while (0 < 100) { // << 0 은 "[빈칸]"
//            0; // << 0 은 "[빈칸]"
            month++;
        }

//        System.out.println(month); // while문 해결 시 주석 해제하세요
    }
}
