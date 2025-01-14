package com.song.operator

class Application1 {
}

/* 설명. 산술연산자(mathmetical operator) */
fun main(args: Array<String>) {
    var divDouble = 6 / 5.toDouble()        // 둘중에 하나만 double이여도 double값이 도출
    println(divDouble)

    /* 설명. 연산시 오버플로우 주위 */
    var intValue: Int = 2147483647
    println("before overflow: $intValue")

    intValue += 1
    println("after overflow: $intValue")
}