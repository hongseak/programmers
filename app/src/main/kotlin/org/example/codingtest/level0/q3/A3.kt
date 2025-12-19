package org.example.codingtest.level0.q3

import org.example.codingtest.base.BaseAnswer
import java.util.Scanner


class A3  : BaseAnswer(){

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
    val a = A3()
    a.solution()
}