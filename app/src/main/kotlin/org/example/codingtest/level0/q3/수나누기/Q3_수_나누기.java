package org.example.codingtest.level0.q3.수나누기;

import java.util.Scanner;

/** [디버깅 문제 안내]
 *  디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
 * 1줄만 수정하여 버그를 고치세요.
 * 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.
 * */

public class Q3_수_나누기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for(int i=0; i< 1; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}

