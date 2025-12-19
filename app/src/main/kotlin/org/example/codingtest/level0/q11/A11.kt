package org.example.codingtest.level0.q11

import org.example.codingtest.base.BaseAnswer
import java.util.Scanner
import kotlin.math.ceil

class A11 : BaseAnswer(){
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

        // 테스트용
        val n = 22
        val w = 6
        val maxLevel = ceil(n.toDouble()/w.toDouble()).toInt()
        val arr = MutableList(maxLevel){ outIt ->
            IntArray(w){ inIt -> (inIt+1) + (outIt + 1) * w }.let{

                if(outIt % 2 == 0){
                    it.sort()
                }else{
                    it.sorted()
                }
            }
        }




        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.next()

        if(c.length < 10){
            return
        }

        if(a !in 0 until 100){

        }

        if(a !in 0..100 || b !in 0..100){
            return
        }

        String.format("%d + %d = %d", a, b, a+b)
    }
}