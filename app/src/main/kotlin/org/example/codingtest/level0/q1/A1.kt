package org.example.codingtest.level0.q1

class A1{
    fun solution(){
        val message = "Let's go!"
        println((1..3).reversed().joinToString())
        println(message)
    }
}

fun main(){
    val a = A1()
    a.solution()
}
