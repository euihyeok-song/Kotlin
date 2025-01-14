package com.song.variable

/* 설명. 상수(const val)와 읽기 전용 변수(val) */
class Student {}

// const val도 기본자료형이나 String만 지원한다.
//const val student: Student = Student()

// 상수는 전역변수로 선언해야 한다.
const val PI = 3.1415

// val은 전역변수로 선언 가능
val lecture = "kotlin"

fun main(args: Array<String>) {

    /* 설명. 1. 지역변수는 읽기 전용 변수(val)만 가능하다. */
    /* const val */
//    const val PI =3.1415          // 상수는 지역변수로 사용할 수 없다.
//    PI = 3.14                     // 상수는 수정이 아된다. (읽기만 가능)
    println(PI)

    /* val */
    val lecture2 = "android"        // val은 지역변수로 선언 가능
//    lecture2 = "java"             // 읽기 전용 변수이므로 수정이 안됨 (읽기만 가능)
    println(lecture2)

    /* 설명. 2. 기본자료형이나 String을 제외한 자료형으로 변수를 선언하려면 읽기 전용 변수(val)만 가능하다. */
    val student:Student = Student() // 셍상자를 활용해 객체를 생성할 때 new를 사용하지 않는다.

}