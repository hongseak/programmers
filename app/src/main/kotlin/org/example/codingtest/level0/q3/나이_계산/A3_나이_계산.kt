package org.example.codingtest.level0.q3.나이_계산

import org.example.codingtest.base.BaseAnswer
import org.example.codingtest.base.Logger
import java.util.Scanner

class A3_나이_계산 : BaseAnswer(){
    override fun solution() {
        val sc = Scanner(System.`in`)
        val year = sc.nextInt()
        val age_type = sc.next()
        var answer = 0

        if (age_type == "Korea") {
            answer = 2030 - year + 1
        } else if (age_type == "Year") {
            answer = 2030 - year
        }
        println(answer)
    }

    override fun cleanCode() {
        clearCode()
    }

    fun clearCode(){
        val sc = Scanner(System.`in`)
        var year = 2030 - sc.nextInt()
        val age_type = sc.next().lowercase()

        year = when(age_type){
            "korea" -> year + 1
            else -> year
        }
        println(year)
    }
}

fun main(){
    val a = A3_나이_계산()
    Logger.getRunTime {
        a.solution()
    }

    Logger.getRunTime {
        a.cleanCode()
    }
}