package org.example.codingtest.level0.q4.병과분류

import org.example.codingtest.base.BaseAnswer
import org.example.codingtest.base.Logger

import java.util.Scanner

class A4_병과분류 : BaseAnswer() {
    override fun solution() {
        val sc = Scanner(System.`in`)
        solution(sc)

    }

    override fun cleanCode(){
        val sc = Scanner(System.`in`)
        cleanCode(sc)
        cleanCode2(sc)
    }

    private fun solution(sc : Scanner){
        val code = sc.next()
        val lastFourWords = code.substring(code.length - 4, code.length)

        if (lastFourWords == "_eye") {
            println("Ophthalmologyc")
        } else if (lastFourWords == "head") {
            println("Neurosurgery")
        } else if (lastFourWords == "infl") {
            println("Orthopedics")
        } else if(lastFourWords == "skin"){
            println("Dermatology")
        }else {
            println("direct recommendation")
        }


    }

    private fun cleanCode(sc : Scanner){
        val code = sc.next()
        val lastFourWords = code.substring(code.length - 4, code.length)

        val department = when(lastFourWords){
            "_eye" -> "Ophthalmologyc"
            "head" -> "Neurosurgery"
            "infl" -> "Orthopedics"
            "skin" -> "Dermatology"
            else -> "direct recommendation"
        }
        println(department)
    }

    private fun cleanCode2(sc : Scanner){
        val code = sc.next()

        val lastFourWords = if(code.length >= 4) code.takeLast(4) else code

        val department = when(lastFourWords){
            "_eye" -> "Ophthalmologyc"
            "head" -> "Neurosurgery"
            "infl" -> "Orthopedics"
            "skin" -> "Dermatology"
            else -> "direct recommendation"
        }
        println(department)
    }

}


fun main(){
    val a = A4_병과분류()
    Logger.getRunTime {
        a.solution()
    }

    Logger.getRunTime {
        a.cleanCode()
    }
}