package org.example.codingtest.level0.q8.닉네임_규칙

import org.example.codingtest.base.BaseAnswer

class A8_닉네임_규칙 : BaseAnswer(){

    override fun solution() {
        solution("asd")
    }

    fun solution(nickName : String): String{
        var answer = ""
        for(i in 0 until nickName.length){
            if(nickName[i] == 'l'){
                answer += "I"
            }else if(nickName[i] == 'w'){
                answer += "vv"
            }else if(nickName[i] == 'W'){
                answer += "VV"
            }else if(nickName[i] == 'O'){
                answer += "0"
            }else{
                answer += nickName[i]
            }
        }
        while(answer.length < 4){
            answer += "o";
        }
        if(answer.length > 8){
            answer = answer.substring(0, 8)
        }
        return answer
    }

    fun cleanCode(nickName : String): String{
        var answer = ""
        // 변환 : l > I / w > vv / W > VV / o > 0 / 그외
        for (i in 0 until nickName.length){
            answer += when(nickName[i]){
                'l' -> "I"
                'w' -> "vv"
                'W' -> "VV"
                'o' -> "0"
                else -> nickName[i]
            }
        }
        // 4글자 미만일 경우 oo으로 채운다
        while (answer.length < 4){
            answer += "o"
        }
        if(answer.length > 8){
            answer = answer.take(8)
        }
        return answer
    }

    fun cleanCode2(nickName: String): String{
        val mapping = mapOf(
            'l' to "I",
            'w' to "vv",
            'W' to "VV",
            'o' to "0"
        )
        val convert = nickName
            .map { mapping[it] ?: it.toString() }
            .joinToString("")

        return convert
            .padEnd(4, 'o') // 4글자 미만일 경우 'o'로 채움
            .take(8) // 8자리 까지 자름
    }




}