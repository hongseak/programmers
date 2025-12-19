package org.example.codingtest.level0.q6

import org.example.codingtest.base.BaseAnswer

class A6 : BaseAnswer() {

    override fun solution() {
        solution(5141, 500, intArrayOf(10, -10, 10, -10, 10, -10, 10, -10, 10, -10))
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