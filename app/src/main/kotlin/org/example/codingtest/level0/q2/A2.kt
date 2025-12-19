package org.example.codingtest.level0.q2

import java.util.Scanner

class A2 {
    fun solution() {
        val sc = Scanner(System.`in`)
        val angle1 = sc.nextInt()
        val angle2 = sc.nextInt()

        val sumAngle = angle1 + angle2
        println(sumAngle % 360)
    }

}

fun main(){
    val a2 = A2()
    a2.solution()
}