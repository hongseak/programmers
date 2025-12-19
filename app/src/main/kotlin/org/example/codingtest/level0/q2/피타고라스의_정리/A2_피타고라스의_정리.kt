package org.example.codingtest.level0.q2.피타고라스의_정리

import org.example.codingtest.base.BaseAnswer
import java.util.Scanner
import kotlin.math.pow

class A2_피타고라스의_정리 : BaseAnswer(){
    override fun solution() {
        val sc = Scanner(System.`in`)
        val a = sc.nextInt()
        val c = sc.nextInt()

        val bSquare = c.toDouble().pow(2.0) - a.toDouble().pow(2.0)
        println(bSquare)
    }
}