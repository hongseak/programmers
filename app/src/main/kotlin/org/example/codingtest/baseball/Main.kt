


import kotlin.random.Random

/*
* 당신은 숫자 야구를 플레이하는 프로그램을 작성해야 합니다.

* 숫자 야구란 1 ~ 9 사이의 서로 다른 숫자 4개로 이루어진 비밀번호를 맞히는 게임입니다.

* 당신은 1000 이상 9999 이하의 정수를 제출할 수 있는 기회가 총 n번 있으며, 수를 제출할 때마다 비밀번호에 관한 단서가 주어집니다.
* 이때 제출한 수의 각 자릿수에 대해 아래와 같이 판정합니다.

* 숫자가 비밀번호에 포함되어 있지 않다면 : OUT
* 숫자가 비밀번호에 포함되어 있지만, 위치가 틀렸다면 : BALL
* 숫자가 비밀번호에 포함되어 있고, 위치까지 정확하다면 : STRIKE
* 위와 같이 STRIKE, BALL으로 판정한 숫자의 개수를 세어, STRIKE가 x개 / BALL이 y개라면 "xS yB" 형식으로 단서가 주어집니다.

* 아래 표는 비밀번호가 1357일 때 제출한 수에 따른 단서의 예시입니다.
* */
class Main  {

    enum class Result {
        WIN, DEFEAT
    }


    data class FindNumber(
        var index: Int = -1, // 위치 찾은경우 양수 못찾은 경우 음수
        var value: Int = -1, // 값 찾은 경우 양수 못찾은 경우 음수
    ) {
        fun isFindIndex() = index != -1
        fun isFindValue() = value != -1
    }

    // 숫자 > 문자열 > 배열 전환 > find
//    fun solution(number: Int) = number.toString().toList()
    // 2. 좀더 예상하기 힘든 랜덤


    // 1. 기본형 랜덤
    fun getRandomNumber() = Random.nextInt(1000, 9999)


    fun createList(): List<Int> {
        val first = Random.nextInt(1, 10)   // 첫 자리는 1~9
        val remaining = (0..9) // << 0부터 9까지 숫자를 나열
            .filter { it != first } // 첫번째로 뽑은 숫자를 제외시킨다. (예를들어 7이 나올경우 배열에서(0,1,2,3,...7(이놈!),8,9) 7를 제외 시킨다)
            .shuffled() // 모든 배열을 섞는다.
            .take(3) // 이후 맨앞 숫자 3개를 가져온다

        return listOf(first) + remaining // 첫번째 생성한 숫자 배열에(7) + take한 숫자 더한다. 결론은 (7, take1, take2, tak3)
    }

    // Strick는 정확환 위치에 있어야 함
    fun changeList(list : List<Int>): List<Int>{
        val first = list.first().takeIf { it == -1 } ?: Random.nextInt(1,10)
        val count = list.count { it == -1 }
        val remaining = (0..9) // << 0부터 9까지 숫자를 나열
            .filter { it != first }
            .filterNot { it in list }
            .shuffled() // 모든 배열을 섞는다.
            .take(3) // 검색된 -1의 개수만큼 가져온다.

        val fillValues = (listOf(first) + remaining).toMutableList()
        fillValues.forEachIndexed { index, value ->
            if(value == -1) {
                fillValues[index] = value
            }
        }

        return fillValues
    }


    fun startGame(count: Int): Result {
        println("야구게임 --------- 시작 ---------")
        var ballCount = 0
        var strikeCount = 0
        var searchCount = 1

        val game = createList() // 랜덤 게임 생성(모른 상태)
        val findList = MutableList(4) { -1 } // 찾은 값을 저장
        println("야구게임 시작 전 정답 : $game")

        while (searchCount < count) {
            // 1. 일단 찾은값이 있는지 확인한다.
            if(findList == game){
                // 1-1. 4K 인경우
                strikeCount = 4
                println("{${(searchCount+1)}} 번째 - 찾은 값 : ${findList} / WINNWER (${strikeCount}S)")
                return Result.WIN
            }else{
                val tempList = if(findList.all { it == -1 }){
                    createList()
                }else {
                    changeList(findList)
                }
                tempList.forEachIndexed { index, value ->
                    if (value == game[index]) {
                        strikeCount++
                        findList[index] = value
                    } else if (game.indexOf(value) != -1) {
                        ballCount++
                    }
                }
                if(strikeCount == 0 && ballCount == 0){
                    println("{${(searchCount+1)}} 번째 - 뽑은 값 : $tempList 찾은 값 : ${findList} / (Out) [뽑기 실패]")
                }else if(strikeCount + ballCount == 4){
                    println("{${(searchCount+1)}} 번째 - 뽑은 값 : $tempList 찾은 값 : ${findList} / 아쉽긴해")
                }else{
                    println("{${(searchCount+1)}} 번째 - 뽑은 값 : $tempList 찾은 값 : ${findList} / (${strikeCount}S / ${ballCount}B)")
                }

            }
            // 2. 그 다음 다시 숫자를 검색한다.
            strikeCount = 0
            ballCount = 0
            searchCount++

        }
        return Result.DEFEAT
    }
}

