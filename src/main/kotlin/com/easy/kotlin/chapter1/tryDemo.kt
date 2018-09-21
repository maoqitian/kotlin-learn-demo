package com.easy.kotlin.chapter1

import java.io.BufferedReader
import java.io.StringReader

/**
 * @Author: maoqitian
 * @Date: 2018/9/21 0021 16:13
 * @Description: Kotlin中的异常处理
 */

fun percentage(number:Int){
    if (number in 1..100)
        number
    else throw IllegalArgumentException("百分比数值必须在1-100之间")
}

fun readNumber(reader:BufferedReader):Int?{ //不需像Java一样要显式的声明这个函数会抛出哪些异常
    try {
        val readLine = reader.readLine()
        return Integer.parseInt(readLine)
    }catch (e:NumberFormatException){
        println(e.toString())
        return null
    }finally { //finally 和Java 中是一样的
        reader.close()
    }
}

fun readNumber2(reader:BufferedReader){
    val t = try {
        val readLine = reader.readLine()
         Integer.parseInt(readLine) //当没有异常发生时使用这个值
    } catch (e: NumberFormatException) {
        println(e.toString())
        null  //	当发生异常时使用null值
    }
    println(t)
}

fun main(array: Array<String>){
    percentage(10)
    println(readNumber(BufferedReader(StringReader("mao"))))
    readNumber2(BufferedReader(StringReader("mao")))
}