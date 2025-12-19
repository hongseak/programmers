package org.example.codingtest.level0.q7.버스

import org.example.codingtest.base.BaseAnswer

class A7_버스 : BaseAnswer(){



    override fun solution(){

    }


    // 1 ≤ seat ≤ 30 : 좌석개수
    // 1 ≤ passengers의 길이 ≤ 10 : 승객이 승하차한 정보
    fun solution(seat : Int, passengers : List<List<String>>) : Int{
        var numPassenger = 0
        for (i in 0 until passengers.size){
            numPassenger += func4(passengers[i])
            numPassenger -= func3(passengers[i])
        }
        val answer = func1(seat - numPassenger) // func()

        return answer
    }

    fun func1(num : Int) = if(0 > num) 0 else num
    fun func2(num : Int) = if(num > 0) 0 else num

    // "Off"는 하차한 승객을 의미합니다.
    fun func3(station : List<String>) : Int{
        var num = 0
        station.forEach { value ->
            if(value.contains("Off")){
                num++
            }
        }
        return num
    }

    // "On"은 승차한 승객,
    fun func4(station : List<String>) : Int{
        var num = 0
        station.forEach { value ->
            if(value.contains("On")){
                num++
            }
        }
        return num
    }








}