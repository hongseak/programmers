package org.example.codingtest.base

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.openjdk.jol.info.ClassLayout
import org.openjdk.jol.info.GraphLayout
import kotlin.time.measureTime

class Logger {

    companion object{
        fun getRunTime(isScannerCode : Boolean = false, unit: () -> Unit) {
            runCatching {
                println()
                println()
//                println("Warmup start...")
                System.gc()
//                Thread.sleep(1000)

//                println("Warmup end.")
//                println()
//                println()
                println("--- run code ---")
                val runtime = Runtime.getRuntime()
                val memoryBefore = runtime.totalMemory() - runtime.freeMemory()

                val duration = measureTime{
                    unit.invoke()   // 사용시간 측정
                }
                val memoryAfter = runtime.totalMemory() - runtime.freeMemory()
                val usage = memoryAfter - memoryBefore


                println("Code info [ time : ${duration} / memory used(not trusting): ${getReadMemory(usage)} / total memory : ${getReadMemory(runtime.totalMemory())}]")
                println("--- finish code ---")
            }

        }
        private fun getReadMemory(l : Long) = String.format("%.2f MB", l.toFloat() / 1024.0 / 1024.0)
    }

}
