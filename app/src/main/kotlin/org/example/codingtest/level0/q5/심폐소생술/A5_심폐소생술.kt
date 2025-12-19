package org.example.codingtest.level0.q5.심폐소생술

import org.example.codingtest.base.BaseAnswer

class A5_심폐소생술 : BaseAnswer() {
    override fun solution() {
        solution(listOf("call", "respiration", "repeat", "check", "pressure"))
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