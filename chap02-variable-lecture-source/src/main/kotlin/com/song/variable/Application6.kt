package com.song.variable

/* 설명. Nullable 타입
    자바의 경우 null이 대입되는 참조자료형이나 Wrapper 클래스 같은 경우에는 null값 여부를
    확인하는 과정을 생략, 혹은 변수에 null값이 대입됐을 수도 있다는 상황을 가정하지 않고 코드를
    작성해서 NullPointerException이 발생하는 상황이 많다.
    코틀린은 변수의 타입을 기본적으로 null값 대입이 허용되지 않는 타입으로 선언하게 되어 있고
    그 외에 여러 연산자들을 통해 NPE를 방지하고 있다.
 */

fun main(args: Array<String>) {

    var num = 100

//    null값 대입 불가
//    num = null

    /* null을 대입받 을 수 있는 Int? 타입의 변수 선언 */
    var a: Int? = 100
    a = null
    println(a)

    /* 설명. 자바에서 볼 수 없었던 연산자 5가지 */
    var c: String? = null
    if(c != null){
        println("if를 통한 Null이 아닌 값 확인:  $c")
    }


    /* 설명. 1. let 함수를 이용한 null 타입값 접근
    *   let 함수는 변수의 값이 null이 아닌 경우에 실행 할 코드 블록을 작성할 수 있게 도와주는 함수
    *   it: value-parameter인 d가 null이 아닌 경우 d를 의미한다.
    */
    var d: String? = "null"
    /*   d?. : d가 null이 아니면 접근하여라 / let: 본인 기준 오른쪽 실행 / it: d를 의미 */
    d?.let {
        println("let을 통한 null이 아닌 값 확인: " + it)
    }


    /* 설명. 2. 안전호출연산자(Safe-call Operator)를 이용하는 방법 (NPE를 방지하는 연산자)
    *   ?와 .을 붙여 null일 경우 우측에 접근하지 않고 곧바로 Null값을 반환한다.
    */
    var len: Int? = d?.length // d가 null일 때 프로퍼티, 메소드 접근을 무시 (NPE 방지)
    println("안전호출 연산자를 통한 문자열 길이 확인: $len")


    /* 설명. 3. 엘비스(Elvis)연산자를 이용하는 방법
    *   연산자 왼쪽의 피연산자가 null이 아닐 경우 해당 값을 반환하고 null일 경우 오른쪽 피연산자를 변환
    *   ***이는 null값이 들어오면 안되는 변수에 null이 들어올 때 다른 값으로 변환해주는 일종의 대책***
    */
    var e = null
    var f = "null"
    var one = e ?: 1
    var two = f ?: 1
    println("one 출력: $one")
    println("two 출력: $two")


    /* 설명. 4. null값이 아님을 보증하는 연산자를 사용해 null을 허용하지 않는 타입으로 변환
    *   ***변수뒤에 !!를 붙이면 이 변수에는 절대 null값이 들어가지 않았다는 보증***
    *   But, null값이 들어갈 수는 있고, 들어가게 된다면 NPE 오류가 런타임 Exception으로 발생시킴
    */
    var nullableStr: String? = "null"
    var str: String = nullableStr!!
    println(str.length)


    /* 설명. 5. null을 반환하는 타입 변환 메소드 */
    var wrongNumberString = "숫자아님"
//    var wrong = wrongNumberString.toInt()
    var wrong: Int? = wrongNumberString.toIntOrNull()
    println(wrong)

}