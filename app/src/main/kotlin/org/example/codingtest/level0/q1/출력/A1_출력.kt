
package org.example.codingtest.level0.q1.출력

import org.example.codingtest.base.BaseAnswer
import org.example.codingtest.base.Logger


/**
 * 👉 [이 문제 보기](문제설명.md)
 * */


class A1_출력 : BaseAnswer(){
    override fun solution() {
        val msg = "Spring is beginning"
        val val1 = 3
        val val2 = "3"

        println(msg)
        println(val1 + 10)
        println(val2 + "10")
    }

    override fun cleanCode() {

    }

}

fun main(){
    val a = A1_출력()
    Logger.getRunTime {
        a.solution()
    }

    Logger.getRunTime {
        a.cleanCode()
    }
}

