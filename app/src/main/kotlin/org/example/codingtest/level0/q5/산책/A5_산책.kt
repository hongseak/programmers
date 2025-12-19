package org.example.codingtest.level0.q5.산책

import org.example.codingtest.base.BaseAnswer

class A5_산책 : BaseAnswer(){

    override fun solution() {
        solution("NSSNEWWN") // [-1, 1]
        solution("EESEEWNWSNWWNS") // [0, 0]
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