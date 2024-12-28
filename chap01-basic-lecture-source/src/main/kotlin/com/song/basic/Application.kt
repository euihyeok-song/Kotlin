package com.song.basic

/*
    설명.
     코틀린 - 가독성 좋은 짧은 코드 작성을 지향한다. (feat. null에 민감)
     코틀린 파일의 특징
     1-1. 자바와 달리 코틀린은 클래스가 반드시 선언 될 필요가 없으며 소스파일명과 클래스명이 달라도 된다.
     1-2. 기본적으로는 package, import, class로 구성되지만 다양한 순서 및 갯수로 구성하고자 하면
          따로 정해진 규칙은 없다
     1-3. main 메소드에 매개변수(소괄호)를 주지 않아도 잘 동작한다.
 */

fun main(args: Array<String>) {

    /* 설명. 콘솔에 출력하기 위해서는 print() 나 println()을 사용한다.
        세미콜론은 적어도 에러는 안나지만 kotlin에서는 사용하지 않는 것이 일반적이다 */
    println("Hello, Kotlin!!")
    print("코틀린 시작!")
    println()

    /* 설명. 한 문장에 구분을 지어야 할 경우에는 ;를 사용한다 */
    println("Hello, Kotlin!!"); print("코틀린 시작!")
    println()

    /* 설명. kotlin은 변수를 동적타입으로 정의한다. + var은 null값을 받을 수 없다. */
    var completion = readLine()
    println("D-" + completion)
}