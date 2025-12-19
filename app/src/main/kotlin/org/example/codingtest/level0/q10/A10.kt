package org.example.codingtest.level0.q10

import org.example.codingtest.base.BaseAnswer
import java.util.Scanner
import kotlin.math.pow
import kotlin.time.toDuration

class A10 : BaseAnswer(){
    override fun solution() {
        val sc = Scanner(System.`in`)
        val a = sc.nextInt()
        val c = sc.nextInt()

        val bSquare = c.toDouble().pow(2.0) - a.toDouble().pow(2.0)
        println(bSquare)
    }
}