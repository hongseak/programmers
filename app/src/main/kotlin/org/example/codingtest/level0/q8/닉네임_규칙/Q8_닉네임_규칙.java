package org.example.codingtest.level0.q8.닉네임_규칙;

/** [디버깅 문제 안내]
 *  디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
 * 1줄만 수정하여 버그를 고치세요.
 * 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.
 * */

public class Q8_닉네임_규칙 {
    public String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        if(answer.length() < 3){
            answer += "o";
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}
