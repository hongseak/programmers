package org.example.codingtest.level0.q4.병과분류

import org.example.codingtest.base.BaseAnswer
import java.util.Scanner

class A4_병과분류 : BaseAnswer() {
    override fun solution() {
        val sc = Scanner(System.`in`)
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


    fun cleanCode(){
        val sc = Scanner(System.`in`)
        val code = sc.next()
        val lastFourWords = code.substring(code.length - 4, code.length)

        val department = when(lastFourWords){
            "_eye" -> "Ophthalmologyc"
            "head" -> "Neurosurgery"
            "infl" -> "Orthopedics"
            "skin" -> "Dermatology"
            else -> "direct recommendation"
        }
        print(department)
    }

    fun cleanCode2(){
        val sc = Scanner(System.`in`)
        val code = sc.next()

        val lastFourWords = if(code.length >= 4) code.takeLast(4) else code

        val department = when(lastFourWords){
            "_eye" -> "Ophthalmologyc"
            "head" -> "Neurosurgery"
            "infl" -> "Orthopedics"
            "skin" -> "Dermatology"
            else -> "direct recommendation"
        }
        print(department)
    }

}