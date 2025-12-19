package org.example.codingtest.level0.q6.물부족;

/** [디버깅 문제 안내]
 *  디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
 * 1줄만 수정하여 버그를 고치세요.
 * 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.
 * */
public class Q6_물_부족 {
    public int solution(int storage, int usage, int[] change) {
        int total_usage = usage + usage* change[0] / 100;
        for(int i=0; i<change.length; i++){
            usage = total_usage * change[i] / 100;
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }
}
