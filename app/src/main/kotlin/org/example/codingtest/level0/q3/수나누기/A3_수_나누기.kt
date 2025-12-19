package org.example.codingtest.level0.q3.수나누기

import org.example.codingtest.base.BaseAnswer
import java.util.Scanner


class A3_수_나누기  : BaseAnswer(){

    override fun solution() {
        val sc = Scanner(System.`in`)
        var number = sc.nextInt()
        var answer = 0

        for (i in 0..number) {
            answer += number % 100
            number /= 100
        }

        println(answer)
    }


    fun cleanCode(){
        val sc = Scanner(System.`in`)
        var number = sc.nextInt()
        var answer = 0

        while(number>0){
            answer += number % 100
            number /= 100
        }
        println(answer)
    }
}

fun main(){
    val a = A3_수_나누기()
    a.solution()
}