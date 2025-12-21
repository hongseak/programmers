package org.example.codingtest.level0.q1.문자_출력

import org.example.codingtest.base.BaseAnswer
import org.example.codingtest.base.Logger


/**
 * 👉 [이 문제 보기](문제설명.md)
 * */

class A1_문자출력 : BaseAnswer(){
    override fun solution(){
        val message = "Let's go!"
        println("3\n2\n1")
        println(message)
    }

    override fun cleanCode() {
        clearCode()
    }

    fun clearCode(){
        val message = "Let's go!"
        (1..3).reversed().forEach {
            println(it.toString())
        }
        println(message)
    }
}

fun main(){
    val a = A1_문자출력()

    Logger.getRunTime{
        a.solution()
    }

    Logger.getRunTime{
        a.cleanCode()
    }
}