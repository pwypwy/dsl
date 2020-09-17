package temp

fun main() {
    val 好好速 = "122"

    println(好好速)

}

/**
 * 原子模型
 * 最小单位
 */
class Event(
    var target: String,
    var why: String,
    var i: String,
    var type: String,
    var tag: String,
    var result: String,
    var todo: String,
    var attr: Map<String,String>

){

}

class Expect(){

}
//半自动化
//渐进式
//抽象需求
//模拟期待
//发散与交织
//信息探针
//小场景 关键信息 参数
//事件 主动,被动
//可选项
//积累过程
//人物核心