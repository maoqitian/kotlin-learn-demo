package com.easy.kotlin.chapter1

/**
 * @Author: maoqitian
 * @Date: 2018/9/19 0019 17:42
 * @Description: 测试变量值
 */
class VariableVSValue{
    fun declareVar(){
        var x = 5 //自动判断类型是 int 初始值是5
        println(x)
        x = 3  // 重新赋值之后是 3
        println(x)
        println(x::class)
        println(x::class.java)
        val rawString = "zdad"
        val fooTemplateString = "$rawString has ${rawString.length} characters"
        println(fooTemplateString)
    }


    fun delareVal(){
        val s="mao" //val 修饰只能赋值一次
        println(s)
        //s="mmm"
        println(s::class)
        println(s::class.java)
    }

}

fun main(array: Array<String>){

    var va=VariableVSValue()
    va.declareVar()
    va.delareVal()
}
