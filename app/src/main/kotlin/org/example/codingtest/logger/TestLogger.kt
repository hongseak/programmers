package com.hssong.codingtest.logger

class TestLogger : Logger {
    val logs = mutableListOf<String>()
    override fun log(tag: String, msg: String) {
        logs.add("$tag: $msg")
    }
}