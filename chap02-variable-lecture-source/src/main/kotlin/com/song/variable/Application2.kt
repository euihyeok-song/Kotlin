package com.song.variable
/*
    설명.
     RawString(원시 문자열)과 StringTemplate(문자열 템플릿)
 */
fun main(args: Array<String>) {
    // 일반 문자열 사용
    var str = "일반 문자열 안에선느 \n\n문자열 안에 엔터나 스 페 이 스\t그리고 탭을 자유롭게 사용할 수 " +
              "\n있으며 이스케이프 문자 사용도\n가능하다."

    // RawString 사용
    var raw = """원시 문자열 안에서는

문자열 안에 엔터나 스 페 이 스 그리고 탭을 자유롭게 사용할 수
있으며 이스케이프 문자 사용도
가능하다"""

    println(str)
    println()
    println(raw)

    var num1 = 10
    var num2 = 20

    val strWithNum = "Hello, $num1"
    println(strWithNum)

    var sum = "sum : ${num1 + num2}"
    println(sum)
}