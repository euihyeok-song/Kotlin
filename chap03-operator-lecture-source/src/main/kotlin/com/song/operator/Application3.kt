package com.song.operator

/* 설명. 배열 및 mutableMap 선언 */
fun main(args: Array<String>) {

    // 인덱스 연산자 사용
    var nums = arrayOf(100, 101, 102)

    /// $가 nums에만 해당하여 주소값만 출력
    println("nums[0]: $nums[0]")
    // 해당하는 배열 내부의 값을 출력
    println("nums[0]: ${nums[0]}")
    println("nums[0]: ${nums[1]}")
    println("nums[0]: ${nums[2]}")

    nums[1] = 200
    println(nums[1])

    /* mutableMap 잠시 살표보기  - java의 Map과 동일*/
    var areaCodeMap = mutableMapOf("02" to "서울", "055" to "경남")
    println(areaCodeMap["02"])
    println(areaCodeMap["055"])

    // 새로운 값 대입
    areaCodeMap["051"] = "부산"
    println(areaCodeMap["051"])
}