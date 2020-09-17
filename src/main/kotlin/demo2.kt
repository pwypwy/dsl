import mbuhot.eskotlin.query.term.term

fun main() {
    val m = mapOf(
            "a1" to "b",
            "a2" to "b",
            "a3" to mapOf(
                    "t1" to "111",
                    "t2" to "222"
            ),
            "a11" to {
            i:Int->{
                println("je $i")
                println("hello")
            }},
            "a4" to "b",
            "a5" to "b",
            "a6" to "b"
    )
    println(m)
}
//通用语法

/**
 * 语句监听
 * 解构化语法
 * 优质工具类
 * 设计思想
 * 渐进式开发
 * 自由度
 * 实例解析
 *
 * 概念域
 * 多样性
 * 介入程度
 * 抽象事件
 * 事件与描述相分离
 * 因果驱动 和 预设布置
 * 有限智能 随机遍历 非标答案
 * 有限理解
 *
 * 特定事件
 * 有限变异
 * 锚定效应
 *
 */
fun test(): Unit {
    println(33333)
}

