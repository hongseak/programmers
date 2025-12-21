package org.example.codingtest.base

import java.util.Scanner

abstract class BaseAnswer {

    abstract fun solution()
    abstract fun cleanCode()



    fun main(){
        solution()
        cleanCode()
    }
}