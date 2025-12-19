package org.example.codingtest.level0.q4.병과분류;

/** [빈칸 채우기 문제입니다.]
 *  빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
 *  빈칸을 제외한 기본 코드는 수정할 수 없습니다.
 *  빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.
 *  */

import java.util.Scanner;

public class Q4_병과분류 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());

        if(lastFourWords.equals("[빈칸]")){
            System.out.println("Ophthalmologyc");
        }
//        else if("[빈칸]"){ << 주석을 해제 후 코딩하세요
            System.out.println("Neurosurgery");
//        }
//        else if("[빈칸]"){ << 주석을 해제 후 코딩하세요
            System.out.println("Orthopedics");
//        }

//        "[빈칸]"{ << 주석을 해제 후 코딩하세요
            System.out.println("Dermatology");
//        }

//        "[빈칸]"{ << 주석을 해제 후 코딩하세요
            System.out.println("direct recommendation");
//        }
    }
}

