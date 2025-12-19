package org.example.codingtest.level0.q2.각도_합치기

import org.example.codingtest.base.BaseAnswer
import java.util.Scanner

class A2_각도_합치기 : BaseAnswer(){
    override fun solution() {
        val sc = Scanner(System.`in`)
        val angle1 = sc.nextInt()
        val angle2 = sc.nextInt()

        val sumAngle = angle1 + angle2
        println(sumAngle % 360)
    }

}

fun main(){
    val a2 = A2_각도_합치기()
    a2.solution()
}