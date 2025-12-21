package org.example.codingtest.level0.q5.심폐소생술

import org.example.codingtest.base.BaseAnswer
import org.example.codingtest.base.Logger

class A5_심폐소생술 : BaseAnswer() {
    override fun solution() {
        println(solution(listOf("call", "respiration", "repeat", "check", "pressure")).toList())

    }

    override fun cleanCode() {
        println(cleanCode(listOf("call", "respiration", "repeat", "check", "pressure")).toList())
    }

    private fun solution(cpr : List<String>) : IntArray{
        val answer = intArrayOf(0, 0, 0, 0, 0)
        val basicOrder = arrayOf<String?>("check", "call", "pressure", "respiration", "repeat")


        for (i in 0..<cpr.size) {
            for (j in 0..<basicOrder.size) {
                if (cpr[i] == basicOrder[j]) {
                    answer[i] = j+1
                    break
                }
            }
        }
        return answer
    }


    private fun cleanCode(cpr : List<String>) : IntArray{
        val basicOrder = arrayOf<String?>("check", "call", "pressure", "respiration", "repeat")
        return cpr.map { basicOrder.indexOf(it) }.toIntArray()
    }
}

fun main(){
    val a = A5_심폐소생술()
    Logger.getRunTime {
        a.solution()
    }

    Logger.getRunTime {
        a.cleanCode()
    }
}