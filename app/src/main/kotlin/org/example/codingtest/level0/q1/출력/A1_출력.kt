package org.example.codingtest.level0.q1.출력

import org.example.codingtest.base.BaseAnswer

class A1_출력 : BaseAnswer(){
    override fun solution() {
        val msg = "Spring is beginning"
        val val1 = 3
        val val2 = "3"

        println(msg)
        println(val1 + 10)
        println(val2 + "10")
    }

}

fun main(){
    val a = A1_출력()
    a.solution()
}