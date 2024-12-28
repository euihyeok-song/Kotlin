package com.song.variable

/* 설명.
    변수를 선언하는 방법
    선언 형식: val(var) 변수명[: 타입] = 값 => null 값 선언 불가
 */

fun main(args: Array<String>) {
    var name: String
    name = "홍길동"   // 처음 값이 대입되면 해당 값의 타입으로 고정
    name = "유관순"   // var이므로 같은 타입의 다른 값이 대입 될수는있다.
//    name = 20     // 다른 타입의 값은 담을 수 없다.

    println(name)

    var age: Int = 19
//    age = 20.0    // int와 float or double은 다르게 판단
    println(age)
}