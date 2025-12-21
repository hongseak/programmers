package org.example.codingtest.level0.q2.각도_합치기

import org.example.codingtest.base.BaseAnswer
import org.example.codingtest.base.Logger
import java.util.Scanner

/**
 * 👉 [이 문제 보기](문제설명.md)
 * */

class A2_각도_합치기 : BaseAnswer(){
    override fun solution() {
        val sc = Scanner(System.`in`)
        val angle1 = sc.nextInt()
        val angle2 = sc.nextInt()

        val sumAngle = angle1 + angle2
        println(sumAngle % 360)
    }

    override fun cleanCode() {

    }

}

fun main(){
    val a = A2_각도_합치기()
    Logger.getRunTime {
        a.solution()
    }

    Logger.getRunTime {
        a.cleanCode()
    }
}