package org.example.codingtest.level0.q6.가채점

import org.example.codingtest.base.BaseAnswer
import org.example.codingtest.base.Logger

class A6_가채점 : BaseAnswer(){

    override fun solution() {
        println(solution(intArrayOf(1), intArrayOf(100), intArrayOf(100,80,90,84,20)))
        println(solution(intArrayOf(3,4), intArrayOf(85,93), intArrayOf(85,92,38,93,48,85,92,56)))
    }

    override fun cleanCode() {
        println(clearCode(intArrayOf(1), intArrayOf(100), intArrayOf(100,80,90,84,20)))
        println(clearCode(intArrayOf(3,4), intArrayOf(85,93), intArrayOf(85,92,38,93,48,85,92,56)))
    }

    fun solution(numbers: IntArray, our_score: IntArray, score_list: IntArray): List<String> {
        val num_student = numbers.size
        val answer = List(num_student){""}.toMutableList()

        for (i in 0..<num_student) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same"
            } else {
                answer[i] = "Different"
            }
        }

        return answer
    }

    fun clearCode(numbers: IntArray, our_score: IntArray, score_list: IntArray): List<String>{
        return numbers.mapIndexed { index, select -> if(score_list[select - 1] == our_score[index]) "same" else "Different"}.toList()
    }
}

fun main(){
    val a = A6_가채점()
    Logger.getRunTime {
        a.solution()
    }

    Logger.getRunTime {
        a.cleanCode()
    }
}