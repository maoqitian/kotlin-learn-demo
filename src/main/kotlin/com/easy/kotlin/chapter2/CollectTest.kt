package com.easy.kotlin.chapter2

/**
 * @Author: maoqitian
 * @Date: 2018/9/29 0029 15:55
 * @Description: 集合测试
 */
fun testCollect(){
    val set = setOf<Int>(1, 2, 3)
    println(set.javaClass) //	javaClass在Kotlin中等价于Java中getClass()
    println(set.first())//打印第一个数字

    val list = listOf<Int>(1, 2, 3)
    println(list.javaClass)
    println(list.max())//打印最大的数字

    val mapOf = mapOf<String, String>("a" to "mao")
    println(mapOf.javaClass)
    println(mapOf)
}

fun main(array: Array<String>){
      testCollect()
}