package org.example.codingtest.level0.q5.산책

import org.example.codingtest.base.BaseAnswer
import org.example.codingtest.base.Logger

class A5_산책 : BaseAnswer(){

    override fun solution() {
        println(solution("NSSNEWWN").toList())
        println(solution("EESEEWNWSNWWNS").toList())
    }

    override fun cleanCode() {

    }

    fun solution(route: String): IntArray {
        var east = 0
        var north = 0
        val answer = IntArray(2)
        for (i in 0..<route.length) {
            when (route.get(i)) {
                'N' -> north++
                'S' -> north--
                'E' -> east++
                'W' -> east--
            }
        }
        answer[0] = east
        answer[1] = north
        return answer
    }
}

fun main(){
    val a = A5_산책()
    Logger.getRunTime {
        a.solution()
    }

    Logger.getRunTime {
        a.cleanCode()
    }
}