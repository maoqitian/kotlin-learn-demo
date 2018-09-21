package com.easy.kotlin.chapter1

/**
 * @Author: maoqitian
 * @Date: 2018/9/21 0021 15:55
 * @Description: 	使用in检查（使用in操作符来检查一个值是否在某个范围内，或者相反的，!in（操作符）来检 查一个值是否不再某个范围内）
 */

fun isLetter(c: Char) = c in 'a'..'z'|| c in 'A'..'Z'
fun	isNotDigit(c:Char)= c !in '0'..'9'

fun recognize(c:Char):String{
    when(c){
        in 'a'..'z'-> return "这是字母"
        in  '0'..'9'->return "这是数字"
        else -> return "不认识"
    }
}

fun main(array: Array<String>){
    println(isLetter('a'))
    println(isNotDigit('0'))
    println(recognize('a'))
}