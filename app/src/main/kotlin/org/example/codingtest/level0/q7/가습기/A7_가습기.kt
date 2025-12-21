package org.example.codingtest.level0.q7.가습기

import org.example.codingtest.base.BaseAnswer
import org.example.codingtest.base.Logger

class A7_가습기 : BaseAnswer() {

    override fun solution() {
        println(solution("auto", 23, 45))
        println(solution("target", 41, 40))
        println(solution("minimum", 10, 34))
    }

    override fun cleanCode() {
        println(cleanCode("auto", 23, 45))
        println(cleanCode("target", 41, 40))
        println(cleanCode("minimum", 10, 34))
    }


    fun func1(humidity: Int, val_set: Int): Int {
        if (humidity < val_set); //            return "[빈칸]"  << 주석을 해제 후 코딩하세요
        return 1
    }

    fun func2(humidity: Int): Int {
        return if (humidity >= 50)  0
        else if (humidity >= 40) 1
        else if (humidity >= 30) 2
        else if (humidity >= 20) 3
        else if (humidity >= 10) 4
        else 5
    }

    fun func3(humidity: Int, val_set: Int): Int {
        if (humidity < val_set) return 1
        return 0
    }

    fun solution(mode_type: String, humidity: Int, val_set: Int): Int {
        var answer = 0
        if (mode_type == "auto") {
            answer = func2(humidity)
        } else if (mode_type == "target") {
            answer = func1(humidity, val_set)
        } else if (mode_type == "minimum") {
            answer = func3(humidity, val_set)
        }
        return answer
    }

    fun cleanCode(mode_type: String, humidity: Int, val_set: Int): Int {
        return when(mode_type) {
            "auto" -> func2(humidity)
            "target" -> func1(humidity, val_set)
            "minimum" -> func3(humidity, val_set)
            else -> 0
        }
    }
}


fun main(){
    val a = A7_가습기()
    Logger.getRunTime {
        a.solution()
    }

    Logger.getRunTime {
        a.cleanCode()
    }


}