package com.easy.kotlin.chapter1

/**
 * @Author: maoqitian
 * @Date: 2018/9/20 0020 11:54
 * @Description: 控制语句
 */
fun Max(a:Int,b:Int):Int{
    var max= if (a>b) a else b
    return max
}

fun main(array: Array<String>){
    println(Max(4,5))
}