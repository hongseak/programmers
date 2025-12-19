package org.example.codingtest.level0.q4.저축

import java.util.Scanner

class A4_저축 {
    fun main() {
        val sc = Scanner(System.`in`)
        val start: Int = sc.nextInt()
        val before: Int = sc.nextInt()
        val after: Int = sc.nextInt()

        var money = start
        var month = 1
        while (money < 70) {
            money += before
            month++
        }
        while (money< 100) {
            money += after
            month++
        }

        println(month)
    }
}