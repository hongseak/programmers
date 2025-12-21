package org.example.codingtest.level0.q6.물부족

import org.example.codingtest.base.BaseAnswer
import org.example.codingtest.base.Logger

class A6_물_부족 : BaseAnswer() {

    override fun solution() {
        println(solution(5141, 500, intArrayOf(10, -10, 10, -10, 10, -10, 10, -10, 10, -10)))
    }

    override fun cleanCode() {

    }

    fun solution(storage: Int, usage: Int, change: IntArray): Int {
        var usage = usage
        var totalUsage = 0
        for (i in change.indices) {
            usage += (usage * change[i] / 100)
            totalUsage += usage
            if (totalUsage > storage) {
                return i // 가뭄이 끝날때까지 물 부족함
            }
        }
        return -1 // 가뭄이 끝날때까지 물이 남음
    }
}

fun main(){
    val a = A6_물_부족()
    Logger.getRunTime {
        a.solution()
    }

    Logger.getRunTime {
        a.cleanCode()
    }
}
