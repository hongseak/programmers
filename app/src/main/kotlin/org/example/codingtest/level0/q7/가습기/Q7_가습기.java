package org.example.codingtest.level0.q7.가습기;

/** [빈칸 채우기 문제입니다.]
 *  빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
 *  빈칸을 제외한 기본 코드는 수정할 수 없습니다.
 *  빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.
 *  */

public class Q7_가습기 {
    public int func1(int humidity, int val_set){
        if(humidity < val_set)
//            return "[빈칸]"  << 주석을 해제 후 코딩하세요
                    ;
        return 1;
    }

    public int func2(int humidity){
        if(humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
//      "[빈칸]"  << 주석을 해제 후 코딩하세요
//      "[빈칸]"  << 주석을 해제 후 코딩하세요
        return  -1; // 위 값을 변경 후 삭제하세요
    }

    public int func3(int humidity, int val_set){
        if(humidity < val_set)
            return 1;
//      "[빈칸]"  << 주석을 해제 후 코딩하세요
        return  -1; // 위 값을 변경 후 삭제하세요
    }

    public int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if(mode_type.equals("auto")){
//            answer = func"[빈칸]";
        }
        else if(mode_type.equals("target")){
//            answer = func"[빈칸]";
        }
        else if(mode_type.equals("minimum")){
//            answer = func"[빈칸]";
        }
        return answer;
    }
}
