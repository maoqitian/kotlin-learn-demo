package com.easy.kotlin.chapter1

/**
 * @Author: maoqitian
 * @Date: 2018/9/20 0020 16:01
 * @Description: When 语句
 */


enum class Color(val r:Int,val g:Int,val b:Int){
    RED(255,	0,	0),
    ORANGE(255,265,0), //当每个常量被创建时指定属性值	YELLOW(255,	255,0),	GREEN(0,255,0),	BLUE(0,0,255),
    INDIGO(75,0,130),
    VIOLET(238,130,238);//	分号（;）在这里是必须的
    //在枚举类中定义了一个方法
    fun	rgb()=	(r*	256	+g)	*256+b
}

class WhenDemo{

    fun getColorIfString(color: Color):String{
        if (color == Color.RED) {
            return "红色"
        }else if(color == Color.ORANGE){
            return "橘色"
        }else if(color ==  Color.INDIGO ){
            return "靛蓝色"
        }else if(color == Color.VIOLET){
            return "紫色"
        }else{
            throw	Exception("Dirty color")
        }
    }
    //使用 when 改写上面的 if 表达式
    fun getColorWhenString(color: Color):String{
        when(color){
            Color.RED -> return "红色"
            Color.ORANGE -> return  "橘色"
            Color.INDIGO -> return "靛蓝色"
            Color.VIOLET ->return "紫色"
            else	->	throw	Exception("Dirty color")
        }
    }
}

fun main(array: Array<String>){
    val whenDemo = WhenDemo()
    println(whenDemo.getColorIfString(Color.INDIGO))
    println(whenDemo.getColorWhenString(Color.INDIGO))
    println(Color.RED.rgb())
}