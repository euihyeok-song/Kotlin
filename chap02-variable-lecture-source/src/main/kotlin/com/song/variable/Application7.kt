package com.song.variable

/* 설명. 배열
    같은 타입의 값을 여러 개 저장하고 관리하기 위해 사용 (Any 타입 사용 시에는 여러 타입도 가능)
    배열을 사용하는 방법
    1. 한가지 배열의 초기값과 크기를 지정 후 생성 (Array)
    2. 원시 타입값을 저장하는 배열 생성 (기본자료형 arrayOf)
    3. 래퍼 타입값을 저장하는 배열 생성 (arrayOf)
*/

fun main(args: Array<String>) {

    // 1
    var arr1: Array<Int> = Array<Int>(3){1}     // {1}은 초기값을 의미
    println(arr1[0])
    println(arr1[1])
    println(arr1[2])

    // Any 타입으로 배열을 선언하면 Collection 처럼 여러 자료형이 들어갈 수 있음
    var arr2: Array<Any> = Array<Any>(2){1}
    arr2[1] = "Hello"
    println(arr2[0])
    println(arr2[1])

    // arrayOf를 통해서 초기화 부터 다른 타입으로 진해할 수 있다.
    var arr3: Array<Any> = arrayOf(1.234, "Hello")
    println(arr3[0])
    println(arr3[1])

    // 2
    // int 배열로 생성후 대입
    var intArr = intArrayOf(1, 2, 3)
    println(intArr[0])
    // 해당 타입이 자바에서 어떤 타입으로 보여지는지 출력
    println(intArr.javaClass.canonicalName)     // int[]

    var charArr = charArrayOf('a', 'b', 'c')
    println(charArr.javaClass.canonicalName)    // char[]

    // 3
    // 참조자료형(객체) 배열 ( 해당 원소드들의 주소값이 담긴다 )
    var intWrapperArr = arrayOf(1,2,3)
    println(intWrapperArr.javaClass.canonicalName)  // java.lang.Integer[]

}