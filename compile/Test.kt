fun main(){
    val list = (1..0).toList()

    

    val sum = list.reduce { total, num ->
        println(total)
        println(num)
        total + num
    }

    println(sum)
}